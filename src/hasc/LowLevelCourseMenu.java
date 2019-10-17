package hasc;

public class LowLevelCourseMenu extends CourseMenu{

	@Override
	public void showAddButton() {
		System.out.println("1) Add Assignment: Low level Course");
	}

	@Override
	public void showViewButton() {
		System.out.println("2) Show Assigment: Low level Course");
		
	}

	@Override
	public void showRadios() {
		System.out.println("3) Radios: Low level Course");
	}

	@Override
	public void showLabels() {
		System.out.println("4) Labels: Low level Course");
	}

}
