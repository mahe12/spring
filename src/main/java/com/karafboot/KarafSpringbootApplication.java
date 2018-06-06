package com.karafboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan
//@ComponentScan({"com.centurylink.pctl.mod.core", "com.centurylink.pctl.mod.sfaint"})
public class KarafSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(KarafSpringbootApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
