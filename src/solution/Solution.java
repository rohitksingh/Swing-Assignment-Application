package solution;

public class Solution {
    
	public String description;
	
	public Solution() {
		
	}
	
	public Solution(String description) {
		this.description = description;
	}
	
	public String getDesc() {
		return description;
	}
	
	public void setDesc(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return description;
	}
	
}
