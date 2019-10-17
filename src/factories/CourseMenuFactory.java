package factories;

import hasc.CourseMenu;
import hasc.Facade;
import hasc.HighLevelCourseMenu;
import hasc.LowLevelCourseMenu;

public class CourseMenuFactory {
	
	private static CourseMenu courseMenu;
	
	public static CourseMenu getCourseMenu(int courseLevel) {
		// Use of Bridge Pattern
		// Low level or High level Course Menu is getting generated based on course_level
		
		if(courseLevel == Facade.LOW_COURSE_LEVEL) {
			courseMenu = new LowLevelCourseMenu();
		}else if(courseLevel == Facade.HIGH_COURSE_LEVEL) {
			courseMenu = new HighLevelCourseMenu();
		}
		
		return courseMenu;
	}

}
