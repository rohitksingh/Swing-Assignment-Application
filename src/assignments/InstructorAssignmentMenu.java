package assignments;

import courses.Assignment;
import hasc.Facade;
import iterators.ListIterator;
import iterators.SolutionIterator;
import visitor.NodeVisitor;
import visitor.ReminderVisitor;

public class InstructorAssignmentMenu extends AssignmentMenu{
	
	public InstructorAssignmentMenu(Assignment assignment) {
		super(assignment);
	}

	@Override
	public void showAssignmentMenu() {
		System.out.println("Show Instructor Assignment menu");
		showAssignmentDetail();
		showSolution();
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

	@Override
	protected void showAssignmentDetail() {
	   System.out.println(assignment);
	}
	
	private void showSolution() {
		NodeVisitor nodeVisitor = new ReminderVisitor();
		System.out.println("Solutions\n------------------");
		ListIterator iterator = new SolutionIterator(assignment.solutions);
		int index = 0;
		while(iterator.hasNext()) {
			System.out.println(++index+") "+iterator.next());
		}
		System.out.println("/n/n");
	}

}
