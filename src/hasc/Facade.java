package hasc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import factories.PersonFactory;
import iterators.ListIterator;
import users.Instructor;
import users.Person;
import users.Student;

public class Facade {
		
	private int UserType;
	public static final int USER_STUDENT = 0;
	public static final int USER_INSTRUCTOR = 1;
	
	private String theSelectedCurse;
	
	private int nCourseLevel;
	public static final int HIGH_COURSE_LEVEL = 0;
	public static final int LOW_COURSE_LEVEL = 1;
	
	private List<String> theCourseList;
	
	private ListIterator listIterator;
	
	private Person thePerson;
	
	private Scanner sc;
	
	
	public void login() {
		
	}
	
	public void addAssignment() {
		
	}
	
	public void viewAssignment() {
		
	}
	
	public void gradeSolution() {
		
	}
	
	public void reportSolutions() {
		
	}
	
	public void submitSolution() {
		
	}
	
	public void remind() {
		System.out.println("Assignment Due on Monday 11:59 PM");
	}
	
	public void createUser() {
		
		// Use of factory method design pattern
		thePerson = PersonFactory.getPerson(UserType);
	}
	
	
	public void createCourseList() {
		theCourseList = new ArrayList<String>();
		theCourseList.add("CSE870");
		theCourseList.add("CSE880");
		theCourseList.add("CSE890");	
	}
	
	public void attachCourseToUser() {
		
	}
	
	public void selectCourse() {
		
		int index = 0;
		System.out.println("Course list:");
		
		// Use of Iterator Pattern
		while(listIterator.hasNext()) {
			System.out.println(index++ +""+ listIterator.next());
		}
		
		System.out.println("Select the course.");
		
		int selection = sc.nextInt();
		System.out.println("Selected Course is: "+theCourseList.get(selection));
		theSelectedCurse = theCourseList.get(selection);
		
	}
	
	public void courseOperation() {
		thePerson.createCourseMenu();
	}
	
	
}
