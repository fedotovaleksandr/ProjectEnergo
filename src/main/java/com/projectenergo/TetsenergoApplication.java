package com.projectenergo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;


@Configuration
@EnableAutoConfiguration
@ComponentScan
public class TetsenergoApplication {

	private static TemplateEngine templateEngine;

	public static void main(String[] args) {
		SpringApplication.run(TetsenergoApplication.class, args);

	}


}
