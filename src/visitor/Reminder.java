package visitor;

import java.util.List;

import assignments.Assignment;
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
	
	public void remind(List<Assignment> assignments) {
		
		System.out.println("Pending Assignments");
		for(Assignment assignment : assignments) {
			nodeVisitor.visitAssgnment(assignment);
		}
		
	}
	
}
