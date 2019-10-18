package users;

import java.util.List;
import java.util.Scanner;

import assignments.AssignmentController;
import assignments.AssignmentMenu;
import courses.Course;
import factories.AssignmentMenuFactory;
import factories.CourseMenuFactory;
import hasc.CourseMenu;
import hasc.Facade;

public abstract class Person {
	
	protected CourseMenu theCourseMenu;
	protected int courseLevel;
	private Scanner sc = new Scanner(System.in);
	protected List<Course> courselist;
		
	public abstract void showMenu();
	
	public abstract void createCourseMenu();
	
	public void showAddButton() {
		// Use of Facade Pattern
		Facade f = new Facade();
		f.addAssignment(AssignmentController.getDummyAssignment(), Facade.UserType);
	}
	
	public void showViewButton() {
		// Use of Facade Pattern
		Facade f = new Facade();
		f.viewAssignment(AssignmentController.getDummyAssignment(), Facade.UserType);
	}
	
	public void showRadios() {
		System.out.println("Clicked on Radio Button");
	}
	
	public void showComboxes() {
		System.out.println("Clicked on ComBox");
	}
	
	public void showLabels() {
		System.out.println("Clicked on Label");
	}
	
	public void setCourseLevel(int courseLevel) {
		this.courseLevel = courseLevel;
		createCourseMenu();
		showMenu();
	}
	
	public CourseMenu getCourseMenu() {
		return theCourseMenu;
	}
	
	public void chooseOption() {
		
		int selection = sc.nextInt();
		switch(selection) {
		case 1:
			showAddButton();
			break;
			
		case 2:
			showViewButton();
			break;
			
		case 3:
			showRadios();
			break;
		case 4:
			showLabels();
			break;
			
		case 5:
			showComboxes();
			break;
			
		default:
			break;
			
		}
		
	}
	
	protected String getLevel(int level) {
		if(courseLevel == Facade.LOW_COURSE_LEVEL)
			return "LOW LEVEL";
		else if(courseLevel == Facade.HIGH_COURSE_LEVEL)
			return "HIGH LEVEL";
		else
			return null;

	}
	
	public void addCourse(Course course) {
		System.out.println(course+" Added");
	}
	
}
