package services;

public class DLLNode {
	public Integer data;
	
	DLLNode prev;
	DLLNode next;
	
	public DLLNode(Integer data) {
		this.data=data;
		this.prev=null;
		this.next=null;
	}

}
