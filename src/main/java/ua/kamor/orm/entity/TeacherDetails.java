package ua.kamor.orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "teacher_details")
@NoArgsConstructor
@Getter
@Setter
public class TeacherDetails extends BaseEntity {

    private String email;

    private String hobby;



}
