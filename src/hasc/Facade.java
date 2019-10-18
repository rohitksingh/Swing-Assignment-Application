package hasc;
import java.util.List;
import java.util.Scanner;

import assignments.Assignment;
import assignments.AssignmentController;
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
import visitor.Reminder;

public class Facade {
		
	public static int UserType;
	public static final int USER_STUDENT = 0;
	public static final int USER_INSTRUCTOR = 1;
	
	private String theSelectedCourse;
	
	public static int nCourseLevel;
	public static final int HIGH_COURSE_LEVEL = 0;
	public static final int LOW_COURSE_LEVEL = 1;
	
	public static List<Course> theCourseList;
	
	public Person thePerson;
	
	private Scanner sc = new Scanner(System.in);
	
	private Login login;
	private CourseController courseController;
	private AssignmentController assignmentController;
	private Reminder reminder;
	
	public Facade() {
		initResources();
	}
	
	
	public void login() {
		login.login();
		createUser(UserType);
	}
	
	public void addAssignment(Assignment assignment, int usertype) {
		
		assignmentController.viewAssignment(assignment, usertype);
	}
	
	public void viewAssignment(Assignment assignment, int usertype) {

		assignmentController.viewAssignment(assignment, usertype);
	}
	
	public void gradeSolution(Assignment assignment) {
		
		assignmentController.gradeSolution(assignment);
		
		
	}
	
	public void reportSolutions(List<Solution> solutions) {
		
		assignmentController.reportSolutions(solutions);

	}
	
	public void submitSolution(Assignment assignment) {
		
		assignmentController.submitSolution(assignment);
				
	}
	
	public void remind(List<Assignment> assignments) {
		reminder.remind(assignments);
	}
	
	public void createUser(int usertype) {
		
		// Use of factory method design pattern
		thePerson = PersonFactory.getPerson(usertype);
	}
	
	
	public void createCourseList() {
		courseController.createAllCourses();
	}
	
	public void attachCourseToUser(Course course) {
		thePerson.addCourse(course);
	}
	
	public void selectCourse() {
	
		theSelectedCourse = courseController.selectCourse(this);
	}
	
	public void courseOperation() {
		
		// Use of Bridge Pattern
		// The course menu is getting generated based on the UserType and nCourseLevel
		thePerson.createCourseMenu();
	}
	
	private void initResources() {
		login = new Login();
		courseController = new CourseController();
		assignmentController = new AssignmentController();
		reminder = new Reminder();
	}
	
	
}
