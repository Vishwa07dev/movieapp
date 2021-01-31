package com.upgrad.movieapp;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class MovieappApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(MovieappApplication.class, args);

		System.out.println(context.getBeanDefinitionCount());

		System.out.println(Arrays.stream(context.getBeanDefinitionNames()).
				collect(Collectors.toList()).contains("myService"));


	}

}
