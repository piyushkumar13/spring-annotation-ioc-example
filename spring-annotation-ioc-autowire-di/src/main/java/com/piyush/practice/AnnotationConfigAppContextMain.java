package com.piyush.practice;

import com.piyush.practice.config.AppConfig;
import com.piyush.practice.domain.Company;
import com.piyush.practice.domain.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pkumar on 8/26/17.
 */
public class AnnotationConfigAppContextMain {

    public static void main(String[] args) {

        /*
        * Here in the new AnnotationConfigApplicationContext("we can also provide package name"), we can also provide
        * package name. By using this overloaded variant, we can have multiple configuration classes in a single package.
        *
        * To separate the concerns or to achieve modularization, we can define multiple configuration classes. Ex -
        * new AnnotationConfigApplicationContext( AppConfig.class, DataSourceConfig.class ).
        *
        * We can also pass one or multiple package names for the container to scan the classes having @Configuration. Ex -
        * new AnnotationConfigApplicationContext("example.spring.app","example.spring.datasource")
        * */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        /*
        * In context.getBean, we need to provide the method name which is returning the object if @Bean is used.
        * If we are using @Bean(name = "myEmployee"), then we have to use the context.getBean("myEmployee").
        * We can also provide the .class type in the context.getBean(..) method. Ex - context.getBean(Employee.class);
        * */
        Employee employee = (Employee) context.getBean("employee");

        System.out.println("The employee details are ::: " + employee);

        Company company = context.getBean(Company.class);
        System.out.println("The company details are ::: " + company);

    }
}
