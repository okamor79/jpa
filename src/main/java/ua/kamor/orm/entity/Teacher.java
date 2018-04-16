package ua.kamor.orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "teacher")
@NoArgsConstructor
@Getter
@Setter

public class Teacher extends BaseEntity {

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 60)
    private String lastName;

    private int age;

    @OneToMany(mappedBy = "teacher")
    private List<Course> course = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "teacher_details_id")
    private TeacherDetails teacherDetails;


}
