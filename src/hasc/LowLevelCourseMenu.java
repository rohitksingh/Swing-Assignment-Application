package hasc;

public class LowLevelCourseMenu extends CourseMenu{

	@Override
	public void showAddButton() {
		System.out.println("1) Add Assignment: LLC");
	}

	@Override
	public void showViewButton() {
		System.out.println("2) Show Assigment: LLC");
		
	}

	@Override
	public void showRadios() {
		System.out.println("3) Radios: LLC");
	}

	@Override
	public void showLabels() {
		System.out.println("4) Labels: LLC");
	}

}
