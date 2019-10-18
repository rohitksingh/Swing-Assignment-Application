package assignments;

import java.util.ArrayList;
import java.util.List;

import courses.Solution;
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
		
		System.out.println("SELECT\n1) Grade Solution \n2) Flag Solution");
		int selection = sc.nextInt();
		
		switch(selection) {
			case 1:
				grade();
				break;
				
			case 2:
				reportSolutions();
				break;
				
			default:
				break;
		}
		
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
	
	private void grade() {
		Facade f = new Facade();
		f.gradeSolution(assignment);
	}
	
	private void reportSolutions() {
		
		List<Solution> reportedSolutions = new ArrayList<Solution>();
		Solution report1 = new Solution("This is solution 1");
		Solution report4 = new Solution("This is solution 4");
		reportedSolutions.add(report1);
		reportedSolutions.add(report4);
		Facade f = new Facade();
		f.reportSolutions(reportedSolutions);
	}

}
