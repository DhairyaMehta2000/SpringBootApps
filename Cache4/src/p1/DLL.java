package p1;

public class DLL {

	DLLNode head;
	DLLNode tail;
	
	public DLL() {
		this.head = new DLLNode(null);
		this.tail = new DLLNode(null);
		this.head.next=this.tail;
		this.tail.prev=this.head;
	}

	public DLLNode getFirst() {
		return head.next;
	}

	public void removeNode(DLLNode dllNode) {
		// TODO Auto-generated method stub
		dllNode.next.prev=dllNode.prev;
		dllNode.prev.next=dllNode.next;
		
	}

	public void insertAtEnd(DLLNode dllnode) {
		// TODO Auto-generated method stub
		DLLNode prev = tail.prev;
		tail.prev=dllnode;
		dllnode.prev=prev;
		prev.next=dllnode;
		dllnode.next=tail;
	}

	public DLLNode insertElementAtEnd(Integer key) {
		// TODO Auto-generated method stub
		DLLNode node = new DLLNode(key);
		insertAtEnd(node);
		return node;
	}
	
	
	
}
