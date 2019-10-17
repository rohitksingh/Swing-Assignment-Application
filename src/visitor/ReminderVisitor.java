package visitor;

import java.util.List;

import courses.Assignment;
import courses.ClassCourseList;
import courses.Course;
import hasc.Facade;
import iterators.CourseIterator;
import iterators.ListIterator;

public class ReminderVisitor extends NodeVisitor{

	private ListIterator iterator;
	
	@Override
	public void visitFacade(Facade facade) {
	    
		List<Course> courses = Facade.theCourseList;
		iterator = new CourseIterator(courses);
		int index = 0;
		while(iterator.hasNext()) {
			System.out.println(++index+")) "+iterator.next());
		}
		
	}

	@Override
	public void visitCourse(Course course) {
		
		System.out.println("All assignments in "+course.getName()+"\n-------------------------");
		List<Assignment> assignment = course.getAssignments();
		for(int i=0;i<assignment.size();i++) {
			System.out.println(i+") "+assignment.get(i).name);
		}
	}

	@Override
	public void visitAssgnment(Assignment assignment) {
		System.out.println("Due date for "+assignment.name+" is "+assignment.duedate);
	}

}
