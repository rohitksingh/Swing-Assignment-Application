package hasc;

public abstract class CourseMenu {
	
	public void showMenu() {
		System.out.println("CourseMenu");
	}
	
	public void showComboxes() {
		System.out.println("This is combox");
	}
	
	public abstract void showAddButton();
	
	public abstract void showViewButton();
	
	public abstract void showRadios();
	
	public abstract void showLabels();

}
