package assignments;

import java.util.Scanner;

import courses.Assignment;

public abstract class AssignmentMenu {

	public Assignment assignment;
	protected Scanner sc = new Scanner(System.in);
	
	public AssignmentMenu(Assignment assignment) {
		this.assignment = assignment;
	}
	
	public abstract void showAssignmentMenu();
	
	protected abstract void showOptions();
	
	protected abstract void showAssignmentDetail();
		
}
