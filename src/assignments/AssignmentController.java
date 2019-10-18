package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import factories.AssignmentMenuFactory;
import iterators.ListIterator;
import iterators.SolutionIterator;
import solution.Solution;

public class AssignmentController{
	
	private Scanner sc = new Scanner(System.in);
	
	public void viewAssignment(Assignment assignment, int usertype) {
		
		// Use of Bridge design pattern
		AssignmentMenuFactory.getAssignmentMenu(usertype, assignment).showAssignmentMenu();
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
