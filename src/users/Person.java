package users;

import assignments.AssignmentMenu;
import factories.AssignmentMenuFactory;
import factories.CourseMenuFactory;
import hasc.CourseMenu;
import hasc.Facade;

public abstract class Person {
	
	protected CourseMenu theCourseMenu;
	protected int courseLevel;
		
	public abstract void showMenu();
	
	public abstract void createCourseMenu();
	
	public void showAddButton() {
		//AssignmentMenuFactory.getAssignmentMenu(Facade.UserType).showAssignmentMenu();
	}
	
	public void showViewButton() {
		
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
	
}
