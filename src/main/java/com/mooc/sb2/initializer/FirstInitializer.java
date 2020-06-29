package com.mooc.sb2.initializer;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import javax.security.auth.login.Configuration;
import java.util.HashMap;
import java.util.Map;

@Order(1)
public class FirstInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment =configurableApplicationContext .getEnvironment();

        Map<String,Object> map =new HashMap<>();
        map.put("key1","values");
        MapPropertySource mapPropertySource=new MapPropertySource("firstInitializer",map);
        environment.getPropertySources().addLast(mapPropertySource);

        System.out.println("run firstInitializer");
    }
}
