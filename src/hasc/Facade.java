package hasc;
import java.util.List;
import java.util.Scanner;

import courses.Assignment;
import courses.Course;
import courses.CourseController;
import courses.Solution;
import factories.AssignmentMenuFactory;
import factories.PersonFactory;
import iterators.CourseIterator;
import iterators.ListIterator;
import iterators.SolutionIterator;
import login.Login;
import users.Instructor;
import users.Person;
import users.Student;

public class Facade {
		
	public static int UserType;
	public static final int USER_STUDENT = 0;
	public static final int USER_INSTRUCTOR = 1;
	
	private String theSelectedCourse;
	
	public static int nCourseLevel;
	public static final int HIGH_COURSE_LEVEL = 0;
	public static final int LOW_COURSE_LEVEL = 1;
	
	private List<Course> theCourseList;
	
	public Person thePerson;
	
	private Scanner sc = new Scanner(System.in);
	
	private Login login;
	private CourseController courseController;
	
	public Facade() {
		initResources();
	}
	
	
	public void login() {
		login.login();
		createUser();
	}
	
	public void addAssignment() {
		//AssignmentMenuFactory.getAssignmentMenu(Facade.UserType).showAssignmentMenu();
	}
	
	public void viewAssignment(Assignment assignment, int usertype) {
		AssignmentMenuFactory.getAssignmentMenu(usertype, assignment).showAssignmentMenu();
	}
	
	public void gradeSolution(Assignment assignment) {
		System.out.println("Grade the solution for: "+assignment.name);
		System.out.println("\n\n");
		ListIterator solutionIterator = new SolutionIterator(assignment.solutions);
		
		while(solutionIterator.hasNext()) {
			System.out.println("Grade the solution out of 10: "+solutionIterator.next());
			int marks = sc.nextInt();
		}
		
	}
	
	public void reportSolutions(List<Solution> solutions) {
		System.out.println("Following solutions have been reported");
		ListIterator solutionIterator = new SolutionIterator(solutions);
		while(solutionIterator.hasNext()) {
			System.out.println(solutionIterator.next());
		}
	}
	
	public void submitSolution(Assignment assignment) {
		
		ListIterator solutionIterator = new SolutionIterator(assignment.solutions);
		System.out.println("Solution for "+assignment.name);
		while(solutionIterator.hasNext()) {
			System.out.println(solutionIterator.next());
		}
		System.out.println("\n\nSubmitted!");
		
	}
	
	public void remind() {
		System.out.println("Assignment Due on Monday 11:59 PM");
	}
	
	public void createUser() {
		
		// Use of factory method design pattern
		thePerson = PersonFactory.getPerson(UserType);
	}
	
	
	public void createCourseList() {
		courseController.createAllCourses();
	}
	
	public void attachCourseToUser() {
		
	}
	
	public void selectCourse() {
		theSelectedCourse = courseController.selectCourse();
	}
	
	public void courseOperation() {
		thePerson.createCourseMenu();
	}
	
	private void initResources() {
		login = new Login();
		courseController = new CourseController();
	}
	
	
}
