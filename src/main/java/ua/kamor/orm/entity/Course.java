package ua.kamor.orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.*;

@Entity
@Table(name = "course")
@NoArgsConstructor @Getter @Setter
public class Course extends BaseEntity {

    private String title;

    @Column(length = 1000)
    private String description;

    @Column(columnDefinition = "DECIMAL(5,2)")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> student = new ArrayList<>();

}
