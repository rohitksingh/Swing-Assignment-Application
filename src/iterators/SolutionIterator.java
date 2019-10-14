package iterators;
import java.util.List;

public class SolutionIterator extends ListIterator{
	
	private int currentItem;
	private List<String> soultionList;
	
    public SolutionIterator(List<String> soultionList) {
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

