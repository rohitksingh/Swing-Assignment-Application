package assignments;

import courses.Assignment;

public class InstructorAssignmentMenu extends AssignmentMenu{
	
	public InstructorAssignmentMenu(Assignment assignment) {
		super(assignment);
	}

	@Override
	public void showAssignmentMenu() {
		System.out.println("Show Instructor Assignment menu");
		showOptions();
	}

	@Override
	public void showOptions() {
		
		System.out.println("1) Grade Solution \n2) Flag Solution");
		
		/*
	     *   Grade Solution
	     *   Flag Solution
	     *   
	     * 	
	     */
	}

}
