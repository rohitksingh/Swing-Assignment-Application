package hasc;

public abstract class CourseMenu {
	
	public void showMenu() {
		System.out.println("CourseMenu\n----------------");
		showAddButton();
		showViewButton();
		showRadios();
		showLabels();
		showComboxes();
		System.out.println("--------------------\nSELECT OPTION");
	}
	
	public void showComboxes() {
		System.out.println("5) This is combox");
	}
	
	public abstract void showAddButton();
	
	public abstract void showViewButton();
	
	public abstract void showRadios();
	
	public abstract void showLabels();

}
