package com.piyush.practice.config;

import com.piyush.practice.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by pkumar on 8/27/17.
 */

@Configuration
@PropertySource({"classpath:config/myprops.properties"})
public class AppConfig {

    @Autowired
    private Environment env;

    @Bean
    public User user(){
        User user = new User();
        user.setName(env.getProperty("user.name"));
        user.setPassword(env.getProperty("user.password"));
        user.setRole(env.getProperty("user.role"));
        user.setDomain(env.getProperty("user.domain"));

        return user;
    }
}
