package factories;

import hasc.Facade;
import users.Instructor;
import users.Person;
import users.Student;

public class PersonFactory {
	
	private static Person person;
	
	public static Person getPerson(int UserType) {
		
		if(UserType== Facade.USER_STUDENT) {
			person = new Student();
		}else if(UserType == Facade.USER_INSTRUCTOR) {
			person = new Instructor();
		}
		
		return person;
	}

}
