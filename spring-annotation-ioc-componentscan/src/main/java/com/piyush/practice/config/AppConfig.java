package com.piyush.practice.config;

import com.piyush.practice.domain.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pkumar on 8/27/17.
 */

@Configuration
@ComponentScan(basePackages = {"com.piyush.practice"})
public class AppConfig {

    @Bean
    Address address(){
        Address address = new Address();
        address.setHouseNo(208);
        address.setArea("Marathahalli");
        address.setCity("Bengaluru");
        address.setState("Karnataka");
        address.setCountry("India");
        address.setPinCode(560037);

        return address;
    }
}
