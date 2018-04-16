package ua.kamor.orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Getter
@Setter

public class Student extends BaseEntity {

    @Column(name = "full_name", length = 100)
    private String fullName;

    private int age;

    @ManyToMany
    @JoinTable(
            name = "strudent_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> course = new ArrayList<>();

}
