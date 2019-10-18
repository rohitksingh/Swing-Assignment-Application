package visitor;

import assignments.Assignment;
import courses.Course;
import hasc.Facade;

public abstract class NodeVisitor {

	public abstract void visitFacade(Facade facade);
	
	public abstract void visitCourse(Course course);
	
	public abstract void visitAssgnment(Assignment assignment);
	
}
