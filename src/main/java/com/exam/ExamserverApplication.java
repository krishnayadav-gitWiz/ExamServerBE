package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.Model.Role;
import com.exam.Model.User;
import com.exam.Model.UserRole;
import com.exam.Services.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Program has started");	
	    
// commenting line from 32 to 53 since we are now directly getting the data from the View.
//		User user = new User();
//		user.setFirstName("Himanshu");
//		user.setLastName("Sharma");
//		user.setUserName("iamhimanshu");
//		user.setPassword("mypassword");
//		user.setEmail("iamhimanshu@gmail.com");
//		user.setProfile("default.png");
//		
//		Role role1= new Role();
//		role1.setRoleId(50L);
//		role1.setRoleType("ADMIN");
//		
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole= new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getFirstName());
		
		
	}

}
