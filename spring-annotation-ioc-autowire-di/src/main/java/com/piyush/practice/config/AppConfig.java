package com.piyush.practice.config;

import com.piyush.practice.domain.Company;
import com.piyush.practice.domain.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pkumar on 8/26/17.
 */

@Configuration
public class AppConfig {

    @Bean
    public Employee employee(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Piyush");
        employee.setCompanyName("ABC");
        employee.setAddress("Bangalore");
        employee.setDegrees(new String[]{"Mtech","Btech"});

        return employee;
    }

    @Bean
    public Company company(){
        Company company = new Company();
        company.setCompanyId(1);
        company.setName("ABC");
        return company;
    }
}
