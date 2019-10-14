package login;

import java.util.Scanner;

import hasc.Facade;
import users.Person;

public class Login {
	
	private Scanner sc = new Scanner(System.in);
	
	public Person loadWelcomePage() {
		
		System.out.println("Welcome to HASC System");
		System.out.println("You are? \n0) Student\n1) Instructor");
		
		int usertype;
		do {
			usertype = sc.nextInt();
		}
		while(!validateUserType(usertype));
		
		return null;
	
	}
	
	private boolean validateUserType(int userType) {
		if(userType==Facade.USER_STUDENT || userType==Facade.USER_INSTRUCTOR) {
			return true;
		}else {
			System.out.println("Invalid Input! Type your input again");
			return false;
		}
	}

}
