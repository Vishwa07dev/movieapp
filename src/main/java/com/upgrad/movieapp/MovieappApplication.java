package com.upgrad.movieapp;

import com.upgrad.movieapp.dao.CustomerDAO;
import com.upgrad.movieapp.entities.Customer;
import java.time.LocalDateTime;
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

		CustomerDAO customerDAO = context.getBean(CustomerDAO.class);


		Customer customer = new Customer();
		customer.setFirstName("Emma");
		customer.setLastName("Stone");
		customer.setUserName("email123stone");
		customer.setPassword("*******");
		customer.setDateOfBirth(LocalDateTime.of(1988,11,6,0,0));

		System.out.println("Before saving : "+customer);
		Customer savedCustomer = customerDAO.save(customer);

		System.out.println("After saving : "+ savedCustomer);

		Customer retrievedCustomer = customerDAO.findById(savedCustomer.getCustomerId());
		System.out.println("Retrieved customer : "+ retrievedCustomer);



		customer.setUserName("newName");

		Customer updatedCustomer = customerDAO.update(customer);
		System.out.println("Updated customer : "+ updatedCustomer);



		customerDAO.delete(updatedCustomer);

		System.out.println("After deleting : "+ customerDAO.findById(updatedCustomer.getCustomerId()));



	}


}
