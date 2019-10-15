package users;

import factories.CourseMenuFactory;
import hasc.CourseMenu;

public abstract class Person {
	
	protected CourseMenu theCourseMenu;
	protected int courseLevel;
		
	public abstract void showMenu();
	
	public abstract void createCourseMenu();
	
	public void showAddButton() {
		
		theCourseMenu.showAddButton();
	}
	
	public void showViewButton() {
		theCourseMenu.showViewButton();
	}
	
	public void showRadios() {
		theCourseMenu.showRadios();
	}
	
	public void showComboxes() {
		theCourseMenu.showComboxes();
	}
	
	public void showLabels() {
		theCourseMenu.showLabels();
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
