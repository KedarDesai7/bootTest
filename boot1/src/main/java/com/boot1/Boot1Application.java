package com.boot1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.lang.Iterable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot1.entities.user;
import com.boot1.doa.userRepo;

@SpringBootApplication
public class Boot1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot1Application.class, args);
		/*
		 * userRepo usRe =context.getBean(userRepo.class); user us=new user();
		 * us.setName("kedar desai"); us.setAddress("pune"); user u=usRe.save(us);
		 * System.out.println(u);
		 */
		userRepo usRe = context.getBean(userRepo.class);
		//add
		//user us = new user();
		//us.setAddress("goa");
		//us.setName("kedar ");

		//user us1 = new user();
	//	us1.setAddress("goa");
		//us1.setName("ethina");

		//List<user> users = List.of(us, us1);

		
		// Iterable<user> re=usRe.saveAll(users); re.forEach(user->{
		// System.out.println(user); });
		
		//System.out.println(users);
		//get n update
		/*
		 * Optional<user> op=usRe.findById(52); user n=op.get();
		 * 
		 * n.setName("Kedar Desai "); n.setAddress("Kyoto");
		 * 
		 * user res=usRe.save(n); System.out.println(res); System.out.println(n);
		 */
		//delete
		//usRe.deleteById(120);

	}
}