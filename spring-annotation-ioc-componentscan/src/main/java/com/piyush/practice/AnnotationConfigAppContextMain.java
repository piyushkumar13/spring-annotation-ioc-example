package com.piyush.practice;

import com.piyush.practice.config.AppConfig;
import com.piyush.practice.domain.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pkumar on 8/27/17.
 */
public class AnnotationConfigAppContextMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = (Student) context.getBean("student");
        student.setCollegeName("DTU");
        student.setName("Piyush");
        student.setRollNo(1);

        System.out.println("The student details are ::: " + student);

    }
}
