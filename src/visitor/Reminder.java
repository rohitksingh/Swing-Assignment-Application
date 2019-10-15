package visitor;

import courses.Assignment;
import courses.ClassCourseList;
import courses.Course;
import hasc.Facade;

public class Reminder {

	private NodeVisitor nodeVisitor;
	
	public Reminder(NodeVisitor nodeVisitor){
		this.nodeVisitor = nodeVisitor;
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
