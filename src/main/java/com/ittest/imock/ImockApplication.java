package com.ittest.imock;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ImockApplication {

    public static void main(String[] age){
        new SpringApplicationBuilder(ImockApplication.class).run(age);
    }
}
