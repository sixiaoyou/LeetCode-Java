package pers.you.learning.leetcode.eighteen;



public class Reference {
	public class ReferenceManager {
	    public Node node;

	    public void copyValue(Node obj) {
	        // copy value from obj to node
	        node=new Node(obj.val);
	    }

	    public void copyReference(Node obj) {
	        // copy reference from obj to node
	        node = obj;
	    
	    }
}
