package com.piyush.practice.config;

import com.piyush.practice.domain.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by pkumar on 8/27/17.
 */
@Configuration
@PropertySource({"classpath:config/studentprops.properties"})
public class AppConfig2 {

    @Value("${student.rollNo}")
    private String rollNo;

    @Value("${student.name}")
    private String name;


    @Value("${student.collegeName}")
    private String collegeName;

    @Bean
    public Student student(){
        Student student = new Student();
        student.setRollNo(Integer.parseInt(rollNo));
        student.setName(name);
        student.setCollegeName(collegeName);
        return student;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }


}
