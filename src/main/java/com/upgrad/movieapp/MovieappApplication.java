package com.upgrad.movieapp;

import com.upgrad.movieapp.dao.CustomerDAO;
import com.upgrad.movieapp.dao.MovieDao;
import com.upgrad.movieapp.entities.Customer;
import com.upgrad.movieapp.entities.Movie;
import com.upgrad.movieapp.services.MovieService;
import java.time.LocalDateTime;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class MovieappApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(MovieappApplication.class, args);

	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}


}
