import java.util.ArrayList;
import java.util.List;

import iterators.CourseIterator;
import iterators.ListIterator;
import iterators.SolutionIterator;

public class Main {

	public static void main(String[] args) {
	
		List<String> courseList = new ArrayList<String>();
		courseList.add("SER501");
		courseList.add("SER515");
		courseList.add("SER531");
		courseList.add("SER564");
		
		ListIterator iterator = new SolutionIterator(courseList);
		
		
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.moveToHead();
		}
		
		
	}
	
}
