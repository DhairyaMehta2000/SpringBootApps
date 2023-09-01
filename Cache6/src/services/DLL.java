package services;



public class DLL {

	DLLNode head;
	DLLNode tail;
	
	public DLL() {
		this.head = new DLLNode(null);
		this.tail = new DLLNode(null);
		this.head.next=tail;
		this.tail.prev=head;
	}
	
	public DLLNode getFirst() {
		return this.head.next;
	}
	
	public void removeNode(DLLNode node) {
		node.next.prev=node.prev;
		node.prev.next=node.next;
	}
	
	public void insertNodeAtEnd(DLLNode node) {
		node.prev=tail.prev;
		node.next=tail.prev.next;
		tail.prev.next=node;
		tail.prev=node;
	}
	
	public DLLNode insertElementAtEnd(Integer data) {
		DLLNode node = new DLLNode(data);
		insertNodeAtEnd(node);
		return node;
	}
}
