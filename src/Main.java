import java.util.ArrayList;
import java.util.List;

import courses.Assignment;
import courses.ClassCourseList;
import courses.Course;
import courses.Solution;
import hasc.Facade;
import iterators.CourseIterator;
import iterators.ListIterator;
import iterators.SolutionIterator;
import users.Person;
import users.Student;
import visitor.NodeVisitor;
import visitor.ReminderVisitor;

public class Main {

	public static void main(String[] args) {
	
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

		
//		Login n Stuff
//		
//		Facade f = new Facade();
//		f.login();
//		f.createCourseList();
//		f.selectCourse();
//		f.courseOperation();
//		f.thePerson.showMenu();
//		f.addAssignment();
		
		
		
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
		ser515.accept(nodeVisitor);
		
		junit.accept(nodeVisitor);
		
		
	}
	
}
