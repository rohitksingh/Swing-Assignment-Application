import java.util.ArrayList;
import java.util.List;

import courses.Assignment;
import courses.ClassCourseList;
import courses.Course;
import courses.Solution;
import factories.CourseMenuFactory;
import factories.PersonFactory;
import hasc.CourseMenu;
import hasc.Facade;
import hasc.HighLevelCourseMenu;
import hasc.LowLevelCourseMenu;
import iterators.CourseIterator;
import iterators.ListIterator;
import iterators.SolutionIterator;
import users.Instructor;
import users.Person;
import users.Student;
import visitor.NodeVisitor;
import visitor.Reminder;
import visitor.ReminderVisitor;

public class Main {

	public static void main(String[] args) {
		
		//BRIDGE PATTERN:  4 Different variation uncomment one by one to test
		//testBridgePattern1();
		//testBridgePattern2();
		//testBridgePattern3();
		//testBridgePattern4();
		
		//VISITOR PATTERN:  3 Different variation uncomment one by one to test
		
		//testReminderVisitFacade();
		//testReminderVisitCourse();
		//testReminderVisitAssignment();
	
		//Factory-Method Pattern: Uncomment to see   
		//testFactoryPattern();
		
		//ITERATOR PATTERN: 2 variation, uncomment one by one to test  
		//testCourseIterator();
		//testSolutionIterator();
		
		// DEMO APPLICATION
		/*
		Facade f = new Facade();
		f.login();
		f.createCourseList();
		f.selectCourse();
		f.courseOperation();
		f.thePerson.showMenu();
		*/
		
		
		
		
		
//		List<String> courseList = new ArrayList<String>();
//		courseList.add("SER501");
//		courseList.add("SER515");
//		courseList.add("SER531");
//		courseList.add("SER564");
//		
//		ListIterator iterator = new SolutionIterator(courseList);
//		
//		
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//			iterator.moveToHead();
//		}
//		
		
//		Person p = new Student();
//		p.setCourseLevel(Facade.HIGH_COURSE_LEVEL);
//		p.setCourseLevel(Facade.LOW_COURSE_LEVEL);	

		
	
		// Normal Flow
//		Facade f = new Facade();
//		f.login();
//		f.createCourseList();
//		f.selectCourse();
//		f.courseOperation();
//		f.thePerson.showMenu();
		
		
//		
//		f.addAssignment();
//		
//		Assignment designPattern = new Assignment("Design Pattern", "DEC 10");
//		designPattern.setDescription(""
//				+ "Introduce Design Patterns (40 MARKS)\n"
//				+ " In  this  homework  we  implemented\n"
//				+ "five  design  patterns  into  the  Homework  Assignment  Distribution\n"
//				+ "and Collection System (HACS). The five design patterns, which are \n"
//				+ "implemented within the HACS systems, are Façade, Bridge, FactoryMethod, \n"
//				+ "Iterator, and Visitor. In the following sections, a brief description of \n"
//				+ "the patterns and the detail implementation of the patterns are presented. \n");
//		
//		Solution ans1 = new Solution("This is solution 1");
//		Solution ans2 = new Solution("This is solution 2");
//		Solution ans3 = new Solution("This is solution 3");
//		Solution ans4 = new Solution("This is solution 4");
//		Solution ans5 = new Solution("This is solution 5");
//		List<Solution> solutionsDesignPattern = new ArrayList<Solution>();
//		solutionsDesignPattern.add(ans1);
//		solutionsDesignPattern.add(ans2);
//		solutionsDesignPattern.add(ans3);
//		solutionsDesignPattern.add(ans4);
//		solutionsDesignPattern.add(ans5);
//		
//		designPattern.setSolutions(solutionsDesignPattern);
//		
//		
//		f.viewAssignment(designPattern, Facade.UserType);
	
		/*
		List<Course> courselist = new ArrayList<Course>();
		
		
		Solution ans1 = new Solution("This is answer 1");
		Solution ans2 = new Solution("This is answer 2");
		Solution ans3 = new Solution("This is answer 3");
		Solution ans4 = new Solution("This is answer 4");
		Solution ans5 = new Solution("This is answer 5");
		
		List<Solution> solutionList = new ArrayList<Solution>();
		
		Assignment junit = new Assignment("Junit", "DEC 10");
		Assignment designPattern = new Assignment("Design Pattern", "DEC 12");
		Assignment reverseEngg = new Assignment("Reverse Engg", "DEC 14");
		Assignment classDiagram = new Assignment("Class Diagram", "NOV 31");
		
		junit.setSolutions(solutionList);
		
		List<Assignment> assignments = new ArrayList<Assignment>();
		assignments.add(junit);
		assignments.add(designPattern);
		assignments.add(reverseEngg);
		assignments.add(classDiagram);
		
		Course ser531 = new Course("SER531");
		Course ser515 = new Course("SER515");
		Course ser501 = new Course("SER501");
		
		ser515.setAssignments(assignments);
		
		courselist.add(ser501);
		courselist.add(ser531);
		courselist.add(ser515);
		
		ClassCourseList classCourseList = new ClassCourseList();
		classCourseList.setCourselist(courselist);
		
		NodeVisitor nodeVisitor = new ReminderVisitor();
		
		Reminder reminder = new Reminder(nodeVisitor);
		reminder.visitCourse(ser515);
		reminder.visitAssignment(junit);	
		*/	
		

	}
	
	
	
	private static void testReminder() {
		
		List<Course> courselist = new ArrayList<Course>();
		
		
		Solution ans1 = new Solution("This is answer 1");
		Solution ans2 = new Solution("This is answer 2");
		Solution ans3 = new Solution("This is answer 3");
		Solution ans4 = new Solution("This is answer 4");
		Solution ans5 = new Solution("This is answer 5");
		
		List<Solution> solutionList = new ArrayList<Solution>();
		
		Assignment junit = new Assignment("Junit", "DEC 10");
		Assignment designPattern = new Assignment("Design Pattern", "DEC 12");
		Assignment reverseEngg = new Assignment("Reverse Engg", "DEC 14");
		Assignment classDiagram = new Assignment("Class Diagram", "NOV 31");
		
		junit.setSolutions(solutionList);
		
		List<Assignment> assignments = new ArrayList<Assignment>();
		assignments.add(junit);
		assignments.add(designPattern);
		assignments.add(reverseEngg);
		assignments.add(classDiagram);
		
		Course ser531 = new Course("SER531");
		Course ser515 = new Course("SER515");
		Course ser501 = new Course("SER501");
		
		ser515.setAssignments(assignments);
		
		courselist.add(ser501);
		courselist.add(ser531);
		courselist.add(ser515);
		
		ClassCourseList classCourseList = new ClassCourseList();
		classCourseList.setCourselist(courselist);
		
		NodeVisitor nodeVisitor = new ReminderVisitor();
		
		Reminder reminder = new Reminder();
		reminder.visitCourse(ser515);
		reminder.visitAssignment(junit);
	}
	
	
	private static void testReminderVisitFacade() {
		Course ser531 = new Course("SER531");
		Course ser515 = new Course("SER515");
		Course ser501 = new Course("SER501");
		List<Course> courselist = new ArrayList<Course>();
		courselist.add(ser501);
		courselist.add(ser515);
		courselist.add(ser531);
		Facade.theCourseList = courselist;
		
		Reminder reminder = new Reminder();
		reminder.visitFacade(null);
	}
	
	private static void testReminderVisitCourse() {
		
		Course ser515 = new Course("SER531");
		Assignment junit = new Assignment("Junit", "DEC 10");
		Assignment designPattern = new Assignment("Design Pattern", "DEC 12");
		Assignment reverseEngg = new Assignment("Reverse Engg", "DEC 14");
		Assignment classDiagram = new Assignment("Class Diagram", "NOV 31");
		List<Assignment> assignments = new ArrayList<Assignment>();
		assignments.add(junit);
		assignments.add(designPattern);
		assignments.add(reverseEngg);
		assignments.add(classDiagram);
		ser515.setAssignments(assignments);
		
		Reminder reminder = new Reminder();
		reminder.visitCourse(ser515);
		
	}
	
	private static void testReminderVisitAssignment() {
		Assignment junit = new Assignment("Junit", "DEC 10");
		
		Reminder reminder = new Reminder();
		reminder.visitAssignment(junit);
	}
	
	private static void testFactoryPattern() {
		
		// The View will be different for both menus
		CourseMenu highlevelmenu =  CourseMenuFactory.getCourseMenu(Facade.HIGH_COURSE_LEVEL);
		highlevelmenu.showMenu();
		
		CourseMenu lowlevelmenu =  CourseMenuFactory.getCourseMenu(Facade.LOW_COURSE_LEVEL);
		lowlevelmenu.showMenu();
		
	}
	
	private static void testBridgePattern1() {
		
		Facade f = new Facade();
		f.createUser(Facade.USER_STUDENT);
		Facade.nCourseLevel = Facade.HIGH_COURSE_LEVEL;
		f.thePerson.createCourseMenu();
		f.thePerson.showMenu();
			
	}
	
	private static void testBridgePattern2() {
		
		Facade f = new Facade();
		f.createUser(Facade.USER_STUDENT);
		Facade.nCourseLevel = Facade.LOW_COURSE_LEVEL;
		f.thePerson.createCourseMenu();
		f.thePerson.showMenu();
			
	}

	private static void testBridgePattern3() {
	
		Facade f = new Facade();
		f.createUser(Facade.USER_INSTRUCTOR);
		Facade.nCourseLevel = Facade.HIGH_COURSE_LEVEL;
		f.thePerson.createCourseMenu();
		f.thePerson.showMenu();
		
	}

	private static void testBridgePattern4() {
	
		Facade f = new Facade();
		f.createUser(Facade.USER_INSTRUCTOR);
		Facade.nCourseLevel = Facade.LOW_COURSE_LEVEL;
		f.thePerson.createCourseMenu();
		f.thePerson.showMenu();
		
	}
	
	private static void testCourseIterator() {
		
		Course ser531 = new Course("SER531");
		Course ser515 = new Course("SER515");
		Course ser501 = new Course("SER501");
		List<Course> courselist = new ArrayList<Course>();
		courselist.add(ser501);
		courselist.add(ser515);
		courselist.add(ser531);
		ListIterator  iterator = new CourseIterator(courselist);
		
		System.out.println("All Courses");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
	private static void testSolutionIterator() {
		
		Solution ans1 = new Solution("This is answer 1");
		Solution ans2 = new Solution("This is answer 2");
		Solution ans3 = new Solution("This is answer 3");
		Solution ans4 = new Solution("This is answer 4");
		Solution ans5 = new Solution("This is answer 5");
		List<Solution> solutionList = new ArrayList<Solution>();
		solutionList.add(ans1);
		solutionList.add(ans2);
		solutionList.add(ans3);
		solutionList.add(ans4);
		solutionList.add(ans5);
		Assignment assignment = new Assignment("Junit", "Dec 12");
		assignment.setSolutions(solutionList);
		
		ListIterator  iterator = new SolutionIterator(solutionList);
	
		System.out.println("All Solution for "+assignment.name);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());		
		}
		
	}
	
}
