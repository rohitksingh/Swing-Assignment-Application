package visitor;

import courses.Assignment;
import courses.ClassCourseList;
import courses.Course;
import hasc.Facade;

public class Reminder {

	private NodeVisitor nodeVisitor;
	
	public Reminder(){
		nodeVisitor = new ReminderVisitor();
	}
	
	public void visitFacade(Facade facade) {
		nodeVisitor.visitFacade(facade);
	}
	
	public void visitCourse(Course course) {
		nodeVisitor.visitCourse(course);
	}
	
	public void visitAssignment(Assignment assignment) {
		nodeVisitor.visitAssgnment(assignment);
	}
	
}
