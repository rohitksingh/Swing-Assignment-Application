package factories;

import assignments.AssignmentMenu;
import assignments.InstructorAssignmentMenu;
import assignments.StudentAssignmentMenu;
import hasc.CourseMenu;
import hasc.Facade;
import hasc.HighLevelCourseMenu;
import hasc.LowLevelCourseMenu;

public class AssignmentMenuFactory {

	
private static AssignmentMenu assignmentMenu;
	
	public static AssignmentMenu getAssignmentMenu(int usertype) {
		
		switch(usertype) {
		
			case Facade.USER_STUDENT:
				assignmentMenu = new StudentAssignmentMenu();
				break;
		
			case Facade.USER_INSTRUCTOR:
				assignmentMenu = new InstructorAssignmentMenu();
				break;
			
			default:
				break;
		}
		
		return assignmentMenu;
	}
	
}
