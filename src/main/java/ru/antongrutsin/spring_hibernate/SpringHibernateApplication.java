package ru.antongrutsin.spring_hibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.antongrutsin.spring_hibernate.model.Product;
import ru.antongrutsin.spring_hibernate.model.User;
import ru.antongrutsin.spring_hibernate.service.Serv;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringHibernateApplication implements CommandLineRunner {
	private Serv service;

	public SpringHibernateApplication(Serv service) {
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		List<Product> productList = service.getUserProducts(13);
		for (Product product : productList) {
			System.out.println(product.getName());
		}
	}
}
