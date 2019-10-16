package iterators;
import java.util.List;

import courses.Solution;

public class SolutionIterator extends ListIterator{
	
	private int currentItem;
	private List<Solution> soultionList;
	
    public SolutionIterator(List<Solution> soultionList) {
		this.soultionList = soultionList;
	}
	
	@Override
	public boolean hasNext() {
		return currentItem != soultionList.size();
	}
	
	@Override
	public void moveToHead() {
		currentItem = 0;
	}
	
	@Override
	public Object next() {
		if(hasNext()) {
			return soultionList.get(currentItem++);
		}else {
			return null;
		}
	}
	
	@Override
	public void remove() {
		soultionList.remove(currentItem);
	}
	
}

