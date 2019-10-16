package courses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hasc.Facade;
import iterators.CourseIterator;
import iterators.ListIterator;

public class CourseController {

	private List<Course> courseList;
	private ListIterator iterator;
	private Scanner sc = new Scanner(System.in);
	
	public void createAllCourses() {
		courseList = new ArrayList<Course>();
		
		
		courseList.add(new Course("CSE870"));
		courseList.add(new Course("CSE880"));
		courseList.add(new Course("CSE890"));
		iterator = new CourseIterator(courseList);
	}
	
	public List<Course> getAllCourses() {
		return courseList;
	}
	
	private void showAllCourses() {
		
		int index=1;
		while(iterator.hasNext())
		{
			System.out.println(index++ +") "+iterator.next());
		}
	}
	
	public String selectCourse() {
		System.out.println("Select Course");
		showAllCourses();
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
	
}
