package iterators;
import java.util.Iterator;
import java.util.List;

public abstract class ListIterator{
			
	public abstract boolean hasNext();
	
	public abstract Object next();
	
	public abstract void remove();
	
	public abstract void moveToHead();
	
}
