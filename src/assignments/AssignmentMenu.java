package assignments;

import courses.Assignment;

public abstract class AssignmentMenu {

	public Assignment assignment;
	
	public AssignmentMenu(Assignment assignment) {
		this.assignment = assignment;
	}
	
	public abstract void showAssignmentMenu();
	
	protected abstract void showOptions();
		
}
