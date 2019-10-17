package users;

import java.util.Scanner;

import assignments.AssignmentController;
import assignments.AssignmentMenu;
import factories.AssignmentMenuFactory;
import factories.CourseMenuFactory;
import hasc.CourseMenu;
import hasc.Facade;

public abstract class Person {
	
	protected CourseMenu theCourseMenu;
	protected int courseLevel;
	private Scanner sc = new Scanner(System.in);
		
	public abstract void showMenu();
	
	public abstract void createCourseMenu();
	
	public void showAddButton() {
		
	}
	
	public void showViewButton() {
		Facade f = new Facade();
		f.viewAssignment(AssignmentController.getDummyAssignment(), Facade.UserType);
	}
	
	public void showRadios() {
		
	}
	
	public void showComboxes() {
		
	}
	
	public void showLabels() {
		
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
	
}
