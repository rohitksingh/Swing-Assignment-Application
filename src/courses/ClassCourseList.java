package courses;

import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.NodeIterator;

import visitor.NodeVisitor;

public class ClassCourseList {

	public List<Course> courselist;

	public List<Course> getCourselist() {
		return courselist;
	}

	public void setCourselist(List<Course> courselist) {
		this.courselist = courselist;
	}
	
} 
