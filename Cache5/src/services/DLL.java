package services;

import java.util.HashMap;
import java.util.Map;

public class DLL {

	DLLNode head;
	DLLNode tail;

	public DLL() {
		head = new DLLNode(null);
		tail = new DLLNode(null);
		this.head.next = tail;
		this.tail.prev = head;
	}

	public DLLNode getFirst() {
		return head.next;

	}

	public void removeNode(DLLNode node) {
		node.next.prev = node.prev;
		node.prev.next = node.next;
	}

	public void insertNodeAtEnd(DLLNode node) {
		node.prev = tail.prev;
		node.next = tail.prev.next;
		tail.prev.next = node;
		tail.prev = node;
		// TODO Auto-generated method stub

	}

	public DLLNode insertElementAtEnd(Integer key) {
		// TODO Auto-generated method stub
		DLLNode node = new DLLNode(key);
		insertNodeAtEnd(node);
		return node;
	}

}
