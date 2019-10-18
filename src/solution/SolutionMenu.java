package solution;

import java.util.List;
import java.util.Scanner;

import assignments.Assignment;
import iterators.ListIterator;
import iterators.SolutionIterator;

public class SolutionMenu {

	private Scanner sc = new Scanner(System.in);
	
	public void reportSolutions(List<Solution> solutions) {
		
		System.out.println("Following solutions have been reported");
		// Use of Iterator Pattern
		ListIterator solutionIterator = new SolutionIterator(solutions);
		while(solutionIterator.hasNext()) {
			System.out.println(solutionIterator.next());
		}
	}
	
	public void gradeSolution(Assignment assignment) {
		
		System.out.println("Grade the solution for: "+assignment.name);
		System.out.println("\n\n");
		
		// Use of Iterator Pattern
		ListIterator solutionIterator = new SolutionIterator(assignment.solutions);
		
		while(solutionIterator.hasNext()) {
			System.out.println("Grade the solution out of 10: "+solutionIterator.next());
			int marks = sc.nextInt();
		}
		System.out.println("Assignment Graded");
	}
	
	public void submitSolution(Assignment assignment) {
		
		// Use of Iterator Pattern
		ListIterator solutionIterator = new SolutionIterator(assignment.solutions);
		System.out.println("Solution for "+assignment.name);
		while(solutionIterator.hasNext()) {
			System.out.println(solutionIterator.next());
		}
		System.out.println("\n\nSubmitted!");
		
	}
	
	
}
