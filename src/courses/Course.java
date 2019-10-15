package courses;

import java.util.List;

import visitor.NodeVisitor;

public class Course {
	
	public String name;
	public List<Assignment> assignments;
	
	public Course() {
		
	}
	
	public Course(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Assignment> getAssignments(){
		return assignments;
	}
	
	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}
	
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitCourse(this);
	}
		
	
}
