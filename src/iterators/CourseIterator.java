package iterators;
import java.util.List;

import courses.Course;

public class CourseIterator extends ListIterator{
	
	
	private int currentItem;
	private List<Course> courseList;
	
    public CourseIterator(List<Course> courseList) {
		this.courseList = courseList;
	}
	
	@Override
	public boolean hasNext() {
		return currentItem!=courseList.size();
	}
	
	@Override
	public void moveToHead() {
		currentItem = 0;
	}
	
	@Override
	public Object next() {
		if(hasNext()) {
			return courseList.get(currentItem++);
		}else {
			return null;
		}
	}
	
	@Override
	public void remove() {
		courseList.remove(currentItem);
	}

}
