package assignments;

import java.util.ArrayList;
import java.util.List;

import courses.Assignment;
import courses.Solution;
import hasc.Facade;

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
		
		int selection = sc.nextInt();
		
		switch(selection) {
		
			case 1:
				submitSolution();
				break;
			
			case 2:
				solveSolution();
				break;
			
			default:
				break;
				
		}
		
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
	
	private void submitSolution() {
		Facade f = new Facade();
		
		Solution mySolution1 = new Solution("My Solution 1");
		Solution mySolution2 = new Solution("My Solution 2");
		Solution mySolution3 = new Solution("My Solution 3");
		Solution mySolution4 = new Solution("My Solution 4");
		List<Solution> mySolutions = new ArrayList<Solution>();
		mySolutions.add(mySolution1);
		mySolutions.add(mySolution2);
		mySolutions.add(mySolution3);
		mySolutions.add(mySolution4);
		
		assignment.setSolutions(mySolutions);
		f.submitSolution(assignment);
	}
	
	private void solveSolution() {
		
	}

	
		
}