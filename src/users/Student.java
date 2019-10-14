package users;

import factories.CourseMenuFactory;
import hasc.CourseMenu;
import hasc.Facade;

public class Student extends Person{


	@Override
	public void showMenu() {
		System.out.println("Menu for Student");
		theCourseMenu.showMenu();
		showAddButton();
		showViewButton();
		showRadios();
		showComboxes();
		showLabels();
		System.out.println("----------------------");
	}

	@Override
	public void createCourseMenu() {
		theCourseMenu = CourseMenuFactory.getCourseMenu(courseLevel);
	}

}
