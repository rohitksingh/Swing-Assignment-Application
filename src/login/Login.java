package login;

import java.util.Scanner;

import hasc.Facade;
import users.Person;

public class Login {
	
	private Scanner sc = new Scanner(System.in);
	private int usertype;
	private String username;
	
	public void login() {
		chooseUserType();
		showLoginPage();
		printUsername(username);
	}
	
	private void chooseUserType() {
		System.out.println("Welcome to HASC System");
		System.out.println("You are? \n0) Student\n1) Instructor");
		
		do {
			usertype = sc.nextInt();
		}
		while(!validateUserType(usertype));
	}
	
	private boolean validateUserType(int userType) {
		if(userType==Facade.USER_STUDENT || userType==Facade.USER_INSTRUCTOR) {
			setUserType(userType);
			return true;
		}else {
			System.out.println("Invalid Input! Type your input again");
			return false;
		}
	}
	
	private void setUserType(int usertype) {
		Facade.UserType = usertype;
	}
	
	private void showLoginPage() {
		
		switch(usertype) {
		
		case Facade.USER_STUDENT:
			System.out.println("You are entering as a student");
			break;
		    
		case Facade.USER_INSTRUCTOR:
			System.out.println("You are entering as an instructor");	
			break;
			
		default: 
			break;
			
		}
		
		enterCredential();
		
	}
	
	private void enterCredential() {
		String password;
		
		sc.nextLine();
		
		do {
			System.out.println("Enter your username");
			username = sc.next();
			System.out.println("Enter your password");
			password = sc.next();
			
		}while(!validateCredentials(username, password));
	}
	
	private boolean validateCredentials(String username, String password) {
		
		if(username.equals("rohit") && password.equals("1234")) {
			return true;
		}else {
			System.out.println("Invalid Credentials! Type your credentials again");
			return false;
		}
	}
	
	private void printUsername(String name) {
		System.out.println("Login successful Welcome :"+name);
	}
	
}
