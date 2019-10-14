import java.util.ArrayList;
import java.util.List;

import users.Instructor;
import users.Person;
import users.Student;

public class Facade {
		
	private int UserType;
	private static final int USER_STUDENT = 0;
	private static final int USER_INSTRUCTOR = 1;
	
	private int theSelectedCurse;
	
	private int nCourseLevel;
	private static final int HIGH_COURSE_LEVEL = 0;
	private static final int LOW_COURSE_LEVEL = 1;
	
	private List<String> theCourseList;
	
	private Person thePerson;
	
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
		if(UserType == Facade.USER_STUDENT) {
			thePerson = new Student();
		}else if(UserType == Facade.USER_INSTRUCTOR) {
			thePerson = new Instructor();
		}
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
		
	}
	
	public void courseOperation() {
		thePerson.createCourseMenu();
	}
	
	
}
