package com.bdd.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import com.bdd.BddCiEjemploApplication; // tu clase main de Spring Boot

@CucumberContextConfiguration
@SpringBootTest(classes = BddCiEjemploApplication.class)
public class CucumberSpringConfiguration {
}
