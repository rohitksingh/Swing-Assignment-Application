package courses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hasc.Facade;
import visitor.Reminder;

public class CourseController {

	private List<Course> courseList;
	private Scanner sc = new Scanner(System.in);
	
	public void createAllCourses() {
		
		Facade.theCourseList = getDummyCourseList();
		
	}
	
	public List<Course> getAllCourses() {
		return courseList;
	}
	
	private void showAllCourses(Facade facade) {
		
		Reminder reminder = new Reminder();
		reminder.visitFacade(facade);
		
	}
	
	public String selectCourse(Facade facade) {
		System.out.println("Select Course");
		showAllCourses(facade);
		int selection;
		do {
			 selection = sc.nextInt();
		}while(!checkinputValidity(1, 3, selection));
		String selectedCourse = courseList.get(selection-1).name;
		
		System.out.println("Select Level");
		showCourseLevel();
		do {
			Facade.nCourseLevel = sc.nextInt();
		}while(!checkinputValidity(0, 1, Facade.nCourseLevel));
		System.out.println("Selected Course is: "+selectedCourse+" ("+getCourseLevel(Facade.nCourseLevel)+")");
		return selectedCourse;
	}
	
	private String getCourseLevel(int selection) {
		
		String courseLevel = null;
		switch(selection) {
		case Facade.LOW_COURSE_LEVEL:
		courseLevel = "LOW LEVEL";
		break;
		
		case Facade.HIGH_COURSE_LEVEL:
			courseLevel = "HIGH LEVEL";
			break;
			
		default:
			break;
		}
		
		return courseLevel;
	}
	
	private void showCourseLevel() {
		System.out.println("0) HIGH LEVEL\n1) LOW LEVEL");
	}
	
	private boolean checkinputValidity(int low,int high, int input) {
		if(input<=high && input >=low) {
			return  true;
		}else {
			System.out.println("Invalid Input! Type your input again");
			return false;
		}
	}
	
	private List<Course> getDummyCourseList() {
		
		courseList = new ArrayList<Course>();	
		courseList.add(new Course("CSE870"));
		courseList.add(new Course("CSE880"));
		courseList.add(new Course("CSE890"));
		
		return courseList;
	}
	
}
