package com.rajeev.dsa.linkedlist;

public class Dll<T> {

	private transient Node<T> head;


	
	public void display() {
		Node<T> currentNode=head;
		System.out.print("List contents [null<-head->");
		while(currentNode!=null) {
			System.out.print(currentNode.data+"<-->");
			currentNode=currentNode.next;
		}
		System.out.print("null]");
		
	}
	
	public void reverseDisplay() {
		Node<T> currentNode=head;
		
		while(currentNode.next!=null) {
			  currentNode=currentNode.next;
		}
		
		System.out.print("Reverse List contents [null->");
		while(currentNode!=null) {
			System.out.print(currentNode.data+"<-->");
			currentNode=currentNode.previous;
			
		}
		System.out.print("head->null");
		
	}
	
	public int listLength() {
		int length=0;
		Node<T> currentNode=head;
		while(currentNode!=null) {
			length++;
			currentNode=currentNode.next;
		}
		return length;
	}
	
	public boolean isEmpty(){ 
		return listLength() == 0; 
	}
	
	// Insert Front
	public void insertFront(Node<T> NodeToInsert) {
		if(head==null) {
			head= NodeToInsert;
		}else {
			NodeToInsert.next=(head);
			head.previous=NodeToInsert;
			head=NodeToInsert;
		}
		return;
	}
	public void insertLast(Node<T> NodeToInsert) {
		if(head==null) {
			head= NodeToInsert;
		}else {
		     Node<T> currentNode=head;
			 while(currentNode.next!=null) {
				currentNode=currentNode.next;
			}
			currentNode.next=NodeToInsert;
			NodeToInsert.previous=currentNode;
			// no need to update head since there is no change in head
		}
		
	}
	
	public void insertAtPosition(Node<T> NodeToInsert,long position) {
		// suppose after inserting the position of this new Node is p
		// In list with three elements 1,2,3 if we insert 4 at position 2 then new list will be like this 1,4,2,3 
		
		if(head==null) {
			head= NodeToInsert;
		}
	
		int size=listLength();
		
		if(position>size+1 || position<1) {
			System.out.println(" Invalid Position , Valid position is 1 to "+(size+1));
		}
		
	    if(position==1) {// insert at beginning 
	    	NodeToInsert.next=(head);
	    	(head).previous=NodeToInsert;
	    	 head= NodeToInsert;
		}else {// insert the Node in the middle or end
			Node<T> previousNode=head;
	    	int count=1;
	    	while (count<position-1) {// stop previousNode pointer one Node before the position Node
	    		previousNode=previousNode.next;
	    		count++;
	    	}
	    	Node<T> currentNode=previousNode.next;
	    	if(null!=currentNode) {
	    	 currentNode.previous=NodeToInsert;
	    	}
	    	previousNode.next=NodeToInsert;
	    	NodeToInsert.next=currentNode;
	    	NodeToInsert.previous=previousNode;
	    	return;
	    }
	}
	
	
	public void insertAfterPosition(Node<T> NodeToInsert,long position) {
		// suppose after inserting the position of this new Node is p
	    // In list with three elements 1,2,3 if we insert 4 at position 2 then new list will be like this 1,4,2,3 
		
		if(head==null) {
			head= NodeToInsert;
		}
	
		int size=listLength();
		
		if(position>size+1 || position<1) {
			System.out.println(" Invalid Position , Valid position is 1 to "+(size+1));
		}
		
	    if(position==1) {// insert at beginning 
	    	NodeToInsert.next=(head);
	    	(head).previous=NodeToInsert;
	    	 head= NodeToInsert;
		}else {// insert the Node in the middle or end
			Node<T> previousNode=head;
	    	int count=1;
	    	while (count<position-1) {// stop previousNode pointer one Node before the position Node
	    		previousNode=previousNode.next;
	    		count++;
	    	}
	    	Node<T> currentNode=previousNode.next;
	    	if(null!=currentNode) {
	    	 currentNode.previous=NodeToInsert;
	    	}
	    	previousNode.next=NodeToInsert;
	    	NodeToInsert.next=currentNode;
	    	NodeToInsert.previous=previousNode;
	    	return;
	    }
	}
	
	public void insertBeforePosition(Node<T> NodeToInsert,long position) {
		// suppose after inserting the position of this new Node is p
	    // in list 1 2 3 if we  insert 4 at position 2 then new list will be like this 1 4 2 3 
		
		if(head==null) {
			head= NodeToInsert;
		}
	
		int size=listLength();
		
		if(position>size+1 || position<1) {
			System.out.println(" Invalid Position , Valid position is 1 to "+(size+1));
		}
		
	    if(position==1) {// insert at beginning 
	    	NodeToInsert.next=(head);
	    	(head).previous=NodeToInsert;
	    	 head= NodeToInsert;
		}else {// insert the Node in the middle or end
			Node<T> previousNode=head;
	    	int count=1;
	    	while (count<position-1) {// stop previousNode pointer one Node before the position Node
	    		previousNode=previousNode.next;
	    		count++;
	    	}
	    	Node<T> currentNode=previousNode.next;
	    	if(null!=currentNode) {
	    	 currentNode.previous=NodeToInsert;
	    	}
	    	previousNode.next=NodeToInsert;
	    	NodeToInsert.next=currentNode;
	    	NodeToInsert.previous=previousNode;
	    	return;
	    }
	}
	
	
		// ???Insert at Specific  Node in the list (insert at a Node whose data is equal to given input)
			public void insertAtData(T NodeData,Node<T> NodeToInsert) {
				if(head==null) {
					System.out.println("List is Empty ! Please Insert Some Node to it and try ");
					return;
				}
				
				Node<T> currentNode=head;
				while(!currentNode.data.equals(NodeData)) {
					if(currentNode.next==null ) {
						System.out.println("No data found ! Please Insert valid Node data ");
						return;
					}else{
						currentNode=currentNode.next;
					}
					
				}
				NodeToInsert.next=currentNode.next;
				NodeToInsert.previous=currentNode;
				currentNode.next=NodeToInsert;
				return;
		}
			
	// Insert After Specific  Node in the list (insert after a Node whose data is equal to given input)
		public void insertAfterData(T NodeData,Node<T> NodeToInsert) {
			if(head==null) {
				System.out.println("List is Empty ! Please Insert Some Node to it and try ");
				return;
			}
			
			Node<T> currentNode=head;
			while(!currentNode.data.equals(NodeData)) {
				if(currentNode.next==null ) {
					System.out.println("No data found ! Please Insert valid Node data ");
					return;
				}else{
					currentNode=currentNode.next;
				}
				
			}
			NodeToInsert.next=currentNode.next;
			NodeToInsert.previous=currentNode;
			currentNode.next=NodeToInsert;
			return;
		}
		
		// Insert After Specific  Node in the list (insert after a Node whose data is equal to given input)
		public void insertBeforeData(T NodeData,Node<T> NodeToInsert) {
			if(head==null) {
				System.out.println("List is Empty ! Please Insert Some Node to it and try ");
				return;
			}
			
			Node<T> currentNode=head;
			while(!currentNode.data.equals(NodeData)) {
				if(currentNode.next==null ) {
					System.out.println("No data found ! Please Insert valid Node data ");
					return;
				}else{
					currentNode=currentNode.next;
				}
				
			}
			NodeToInsert.next=currentNode;
			NodeToInsert.previous=currentNode.previous;
			currentNode.previous=NodeToInsert;
			return;
		}
		
		//Node Using Static class
		public static class Node<T> {
			private T data;
			private Node<T> next;
			private Node<T> previous;
				// constructor
				public Node(T data) {
						this.data = data;
				}
		}
}
