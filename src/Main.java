import java.util.ArrayList;
import java.util.List;

import hasc.Facade;
import iterators.CourseIterator;
import iterators.ListIterator;
import iterators.SolutionIterator;
import users.Person;
import users.Student;

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
//		
		
		Facade f = new Facade();
		f.login();
		
		
	}
	
}
