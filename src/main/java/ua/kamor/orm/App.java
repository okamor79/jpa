package ua.kamor.orm;

import ua.kamor.orm.entity.Teacher;
import ua.kamor.orm.entity.TeacherDetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App
{
    public static void main( String[] args )     {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql");

        EntityManager eM = entityManagerFactory.createEntityManager();

        eM.getTransaction().begin();

//        TeacherDetails td = new TeacherDetails();
//        td.setHobby("music");
//        td.setEmail("fgdgfdgdfh");
//        eM.persist(td);
//
//        Teacher teachet = new Teacher();
//
//
//        teachet.setFirstName("John");
//        teachet.setLastName("Doe1");
//        teachet.setAge(24);
//
//        teachet.setTeacherDetails(td);
//        eM.persist(teachet);



        Teacher teacher = eM.find(Teacher.class, 1);

        System.out.println(teacher.getFirstName() + " " + teacher.getLastName());

        eM.getTransaction().commit();

        eM.close();
        entityManagerFactory.close();

    }
}
