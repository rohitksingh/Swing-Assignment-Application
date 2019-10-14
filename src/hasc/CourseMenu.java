package hasc;

public abstract class CourseMenu {
	
	public void showMenu() {
		showAddButton();
		showViewButton();
		showRadios();
		showLabels();
	}
	
	public void showComboxes() {
		
	}
	
	public abstract void showAddButton();
	
	public abstract void showViewButton();
	
	public abstract void showRadios();
	
	public abstract void showLabels();

}
