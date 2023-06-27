package com.tours;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.tours.models.Pack;
import com.tours.models.User;
import com.tours.repos.PackRepository;
import com.tours.services.UserService;

@SpringBootApplication
@EnableJpaAuditing
public class ToursAndTravelsApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ToursAndTravelsApplication.class);
	@Autowired
	private EmailSenderService senderService;
	@Autowired
	private PackRepository prepo;

	public static void main(String[] args)  {
		SpringApplication.run(ToursAndTravelsApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		senderService.sendSimpleEmail("pavanpulicherla315@gmail.com",
				"Booking confirmation",
				"Congratulations,Your trip has been booked successfully");

	}


	@Bean
	public CommandLineRunner demo(UserService srv) {
	    return (args) -> {
	    	if(srv.getAllUsers().size()==0) {
	    		User user=new User();
	    		user.setUserid("admin");
	    		user.setPwd("admin586");
	    		user.setRole("Admin");
	    		user.setGender("Male");
	    		user.setAddress("Mysore");
	    		user.setPhone("9999988888");
	    		user.setUname("admin");
	    		srv.saveUser(user);
	    		log.info("Admin user created successfully");
	    	}
	    };
	}

	

	
}
