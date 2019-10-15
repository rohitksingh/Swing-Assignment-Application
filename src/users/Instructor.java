package users;

import factories.CourseMenuFactory;
import hasc.CourseMenu;

public class Instructor extends Person{

	@Override
	public void showMenu() {
		System.out.println("Menu for Instructor");
		theCourseMenu.showMenu();
	}

	@Override
	public void createCourseMenu() {
		theCourseMenu = CourseMenuFactory.getCourseMenu(courseLevel);
	}

}
