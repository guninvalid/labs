//package morsecode;

public class TreeNode {
	
	private Object v;
	private TreeNode l;
	private TreeNode r;
	
	public TreeNode(Object pv, TreeNode pl, TreeNode pr) { 
		
		this.v = pv;
		this.l = pl;
		this.r = pr;
		
	}
	
	public TreeNode(Object pv){
		
		this.v = pv;
		this.l = null;
		this.r = null;
		
	}
	
	public Object getValue() {
		
		return v;
		
	}
	
	public TreeNode getLeft() {
		
		return l;
		
	}
	
	public TreeNode getRight() {
		
		return r;
		
	}
	
	public void setValue(Object pv) {
		
		this.v = pv;
		
	}
	
	public void setLeft(TreeNode pl) {
		
		this.l = pl;
		
	}
	
	public void setRight(TreeNode pr) {
		
		this.r = pr;
		
	}
	
	public String toString() {
		
		return String.valueOf(this.v) + ": [" + String.valueOf(l.v) + ", " + String.valueOf(r.v) + "]";  
		
	}
	
}
