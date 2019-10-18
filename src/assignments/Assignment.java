package assignments;

import java.util.List;

import solution.Solution;
import visitor.NodeVisitor;

public class Assignment {

	public String name;
	public String duedate;
	public String description;
	public List<Solution> solutions;
	
	public Assignment() {
		
	}
	
	public Assignment(String name, String duedate) {
		this.name = name;
		this.duedate = duedate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Solution> getSolutions() {
		return solutions;
	}
	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}
	
	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitAssgnment(this);
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Assignment: "+name+"\n"+"Due Date: "+duedate+"\n\n"+description;
	}
	
}
