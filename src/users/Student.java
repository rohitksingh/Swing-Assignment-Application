package users;

import factories.CourseMenuFactory;
import hasc.CourseMenu;
import hasc.Facade;

public class Student extends Person{

	@Override
	public void showMenu() {
		System.out.println("\n----------------------\nCourseMenu for Student (LEVEL: )"+getLevel(courseLevel)+")");	
		theCourseMenu.showMenu();
		chooseOption();
		System.out.println("----------------------");
	}

	@Override
	public void createCourseMenu() {
		theCourseMenu = CourseMenuFactory.getCourseMenu(courseLevel);
	}

}
