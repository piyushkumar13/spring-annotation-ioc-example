package com.piyush.practice;

import com.piyush.practice.config.AppConfig;
import com.piyush.practice.config.AppConfig2;
import com.piyush.practice.domain.Student;
import com.piyush.practice.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pkumar on 8/27/17.
 */
public class AnnotationConfigAppContextMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
        User user = (User) context.getBean("user");
        System.out.println("The user details are ::: " + user);

        Student student = (Student) context.getBean("student");
        System.out.println("The student details are ::: "+ student);
    }
}
