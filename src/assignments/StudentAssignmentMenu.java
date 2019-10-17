package assignments;

import courses.Assignment;

public class StudentAssignmentMenu extends AssignmentMenu{
	
	public StudentAssignmentMenu(Assignment assignment) {
		super(assignment);
	}

	@Override
	public void showAssignmentMenu() {
		System.out.println("Show Student Assignment menu");
		showAssignmentDetail();
		showOptions();
	}


	@Override
	public void showOptions() {
		
		System.out.println("1) Submit Solution \n2) Solve Solution");
		
	    /*
	     * 
	     * 
	     *   Submit Solution
	     *   Solve Soltion
	     * 
	     * 	
	     */
	}

	@Override
	protected void showAssignmentDetail() {
	
		System.out.println(assignment);
		
	}

	
		
}