package com.manytomany.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.manytomany.manytomany.Entity.Customer;
import com.manytomany.manytomany.Entity.Item;
import com.manytomany.manytomany.Repository.CustomerRepo;
import com.manytomany.manytomany.Repository.ItemRepo;

@SpringBootApplication
public class ManytomanyApplication implements CommandLineRunner {
	@Autowired
	CustomerRepo ob;
	@Autowired
	ItemRepo ob1;

	public static void main(String[] args) {
		SpringApplication.run(ManytomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer c1=new Customer(1,"cust1");
		Customer c2=new Customer(2,"cust2");
		Item i1=new Item(1,"item1");
		Item i2=new Item(2,"item2");
		c1.getItems().add(i1);
		c1.getItems().add(i2);
		c2.getItems().add(i1);
		c2.getItems().add(i2);
		ob.save(c1);
		ob.save(c2);
		//ob.save(c2);
		//ob.save(c2);

		
		
	}

}
