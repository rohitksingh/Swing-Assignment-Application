package hasc;

public class LowLevelCourseMenu extends CourseMenu{

	@Override
	public void showAddButton() {
		System.out.println("Show: LLC");
	}

	@Override
	public void showViewButton() {
		System.out.println("View: LLC");
		
	}

	@Override
	public void showRadios() {
		System.out.println("Radios: LLC");
	}

	@Override
	public void showLabels() {
		System.out.println("Labels: LLC");
	}

}
