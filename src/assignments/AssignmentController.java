package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import courses.Assignment;
import courses.Solution;
import factories.AssignmentMenuFactory;
import iterators.ListIterator;
import iterators.SolutionIterator;

public class AssignmentController{
	
	private Scanner sc = new Scanner(System.in);
	
	public void viewAssignment(Assignment assignment, int usertype) {
		AssignmentMenuFactory.getAssignmentMenu(usertype, assignment).showAssignmentMenu();
	}
	
	public void gradeSolution(Assignment assignment)
	{
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
	
	public void reportSolutions(List<Solution> solutions) {
		System.out.println("Following solutions have been reported");
		
		// Use of Iterator Pattern
		ListIterator solutionIterator = new SolutionIterator(solutions);
		while(solutionIterator.hasNext()) {
			System.out.println(solutionIterator.next());
		}
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
	
	public static Assignment getDummyAssignment() {
		Assignment designPattern = new Assignment("Design Pattern", "DEC 10");
		designPattern.setDescription(""
				+ "Introduce Design Patterns (40 MARKS)\n"
				+ " In  this  homework  we  implemented\n"
				+ "five  design  patterns  into  the  Homework  Assignment  Distribution\n"
				+ "and Collection System (HACS). The five design patterns, which are \n"
				+ "implemented within the HACS systems, are Façade, Bridge, FactoryMethod, \n"
				+ "Iterator, and Visitor. In the following sections, a brief description of \n"
				+ "the patterns and the detail implementation of the patterns are presented. \n");
		
		Solution ans1 = new Solution("This is solution 1");
		Solution ans2 = new Solution("This is solution 2");
		Solution ans3 = new Solution("This is solution 3");
		Solution ans4 = new Solution("This is solution 4");
		Solution ans5 = new Solution("This is solution 5");
		List<Solution> solutionsDesignPattern = new ArrayList<Solution>();
		solutionsDesignPattern.add(ans1);
		solutionsDesignPattern.add(ans2);
		solutionsDesignPattern.add(ans3);
		solutionsDesignPattern.add(ans4);
		solutionsDesignPattern.add(ans5);
		designPattern.setSolutions(solutionsDesignPattern);
		
		return designPattern;
	}

}
