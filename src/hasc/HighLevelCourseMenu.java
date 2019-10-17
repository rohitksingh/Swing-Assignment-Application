package hasc;

public class HighLevelCourseMenu extends CourseMenu{

	
	@Override
	public void showAddButton() {
		System.out.println("1) Add Assignment: HLC");
	}

	@Override
	public void showViewButton() {
		System.out.println("2) View Assignment: HLC");
		
	}

	@Override
	public void showRadios() {
		System.out.println("3) Radios: HLC");
	}

	@Override
	public void showLabels() {
		System.out.println("4) Labels: HLC");
	}
	

}
