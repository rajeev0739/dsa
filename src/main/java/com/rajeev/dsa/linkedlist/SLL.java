package com.rajeev.dsa.linkedlist;



public class Sll<T> {
	
	private transient Node<T> head;


	
	public void display() {
		Node<T> currentNode=head;
		System.out.print("List contents [head->");
		while(currentNode!=null) {
			System.out.print(currentNode.data+"->");
			currentNode=currentNode.next;
		}
		System.out.print("null]");
		
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
	
	public void insertFront(Node<T> nodeToInsert) {
		if(head==null) {
			head= nodeToInsert;
			
		}else {
			nodeToInsert.next=head;
			head=nodeToInsert;
		}
		return;
	}
	
	public void insertLast(Node<T> nodeToInsert) {
		if(head==null) {
			head= nodeToInsert;
			
		}else {
		     Node<T> currentNode=head;
			 while(currentNode.next!=null) {
				currentNode=currentNode.next;
			}
			currentNode.next=nodeToInsert;
			// no need to update head since there is no change in head
		}
		return;
		
	}
	
	
	public void insertAtPosition(Node<T> nodeToInsert,long position) {
			// suppose after inserting the position of this new node is p
		    // in list 1 2 3 if we  insert 4 at position 2 then new list will be like this 1 4 2 3 
			
			
		
			int size=listLength();
			
			// position should be valid and list should be not empty i.e list head should not be null
			if(position>size+1 || position<1 ) {
				System.out.println(" Invalid Position , Valid position is 1 to "+(size+1));
				return;
			}
			
		    if(position==1) {// insert at beginning 
		    	nodeToInsert.next=(head);
				head= nodeToInsert;
				return;
			}else if(size!=0){// insert the node in the middle or end
				Node<T> previousNode=head;
		    	int count=1;
		    	while (count<position-1) {// stop previousNode pointer one node before the position node
		    		previousNode=previousNode.next;
		    		count++;
		    	}
		    	
		    	Node<T> currentNode=previousNode.next;
		    	nodeToInsert.next=currentNode;
		    	previousNode.next=nodeToInsert;
		    	return;
		    }
		    
		}
	
	
	public void insertAfterPosition(Node<T> nodeToInsert,long position) {
			// suppose after inserting the position of this new node is p
		    // in list 1 2 3 if we  insert 4 at position 2 then new list will be like this 1 4 2 3 
			int size=listLength();
			
			if(size==0 || position>size || position<1 ) {
				if(size==0)
					System.out.println(" Invalid Position");
				else 
					System.out.println(" Invalid Position , Valid position is 1 to "+size);
				return;
			}
			
		       // insert the node in the middle or end
			
				Node<T> currentNode=head;
		    	int count=1;
		    	while (count!=position) {// stop previousNode pointer at the position node
		    		currentNode=currentNode.next;
		    		count++;
		    	}
		    	nodeToInsert.next=currentNode.next;
		    	currentNode.next=nodeToInsert;
		    	return;
		
		   
		    
		}
	
	public void insertBeforePosition(Node<T> nodeToInsert,long position) {// same as insert at position 
		// suppose after inserting the position of this new node is p
	    // in list 1 2 3 if we  insert 4 at position 2 then new list will be like this 1 4 2 3 
		insertAtPosition( nodeToInsert, position);
		return;
		
	}

	
	// Insert After Specific  node in the list (insert after a node whose data is equal to given input)
	public void insertAtDataNode(T nodeData,Node<T> nodeToInsert) {
		if(head==null) {
			System.out.println("List is Empty ! Please Insert Some node to it and try ");
			return;
		}
		
		Node<T> currentNode=head;
		Node<T> previousNode=head;
		
	 
		if(currentNode.data.equals(nodeData)) {// in case if we need to add in place of first element 
			nodeToInsert.next=currentNode;
			head=nodeToInsert;// here head is modified so need to Reassign
			return;
		}
		
		while(!currentNode.data.equals(nodeData)) {
			if(currentNode.next==null ) {
				System.out.println("No data found ! Please Insert valid node data ");
				return;
			}else{
				previousNode=currentNode;
				currentNode=currentNode.next;
			}
			
		}
		nodeToInsert.next=currentNode;
		previousNode.next=nodeToInsert;
		return;
	}
	
	// Insert Before a Data Node in the list (insert before a node whose data is equal to given input)
	public void insertBeforeDataNode(T nodeData,Node<T> nodeToInsert) {// same insert at data node
		insertAtDataNode(nodeData,nodeToInsert);
		
	}
	
	// Insert After Specific  node in the list (insert after a node whose data is equal to given input)
	public void insertAfterDataNode(T nodeData,Node<T> nodeToInsert) {
		if(head==null) {
			System.out.println("List is Empty ! Please Insert Some node to it and try ");
			return;
		}
		
		Node<T> currentNode=head;
		while(!currentNode.data.equals(nodeData)) {
			if(currentNode.next==null ) {
				System.out.println("No data found ! Please Insert valid node data ");
				return;
			}else{
				currentNode=currentNode.next;
			}
			
		}
		nodeToInsert.next=currentNode.next;
		currentNode.next=nodeToInsert;
		return;
	}
	
 
	public void deleteFront() {
		
		if(head==null) {
			return;
		}else {
			Node<T> currentNode=head.next;
			head=currentNode;
			// here old head node will have no active reference and it's memory will be get free  by java garbage collector 
			// no need to make head null deliberately
		}
	}
	
	public  void deleteLast() {
		if(head==null) {
			return;
		}else {
			Node<T> previousNode=head;
			Node<T> currentNode=head.next;
			while(currentNode.next!=null) {
				previousNode=currentNode;
				currentNode=currentNode.next;
			}
			previousNode.next=currentNode.next;
			currentNode=null;
			return;
		}
	}
	
	public void deleteAtPosition(long position){
		
		if(head==null) {
			return ;
		}else {
			
			int size=listLength();
			if(position>size||position<1) {
				System.out.println(" Invalid Position , Valid position is 1 to "+(size));
				return ;
			}
			
		}if(position==1) {// deleting node from beginning
			Node<T> currentNode=head.next;
			head=currentNode;
			// here old head node will have no active reference and it's memory will be get free  by java garbage collector 
			// no need to make head null deliberately
			
			
		}else {// deleting node from end or in the middle
			
			Node<T> previousNode=head;
			int count=1;
			while (count<position-1) {// stop previousNode pointer one node before the position node
				previousNode=previousNode.next;
				count++;
			}
			Node<T> currentNode=previousNode.next;
			previousNode.next=currentNode.next;
			currentNode=null;
			 
		}
		return ;	
	}
	
	public void deleteAfterPosition(long position){
		
		if(head==null) {
			return ;
		}else {
			
			int size=listLength();
			if(position>size-1||position<0) {
				System.out.println(" Invalid Position , Valid position is 0 to "+(size-1));
				return ;
			}
			
		}if(position==0) {// deleting node from beginning
			Node<T> currentNode=(head).next;
			head=currentNode;
			// here old head node will have no active reference and it's memory will be get free  by java garbage collector 
			// no need to make head null deliberately
			
			
		}else {// deleting node from end or in the middle
			
			Node<T> previousNode=head;
			int count=1;
			while (count<position) {// stop previousNode pointer one node before the position node
				previousNode=previousNode.next;
				count++;
			}
			Node<T> currentNode=previousNode.next;
			previousNode.next=currentNode.next;
			currentNode=null;
			 
		}
		return ;	
	}

	public void deleteBeforePosition(long position){
	
	if(head==null) {
		return ;
	}else {
		
		int size=listLength();
		if(position>size||position<2) {
			System.out.println(" Invalid Position , Valid position is 2 to "+(size));
			return ;
		}
		
	}if(position==2) {// deleting node from beginning
		Node<T> currentNode=(head).next;
		head=currentNode;
		// here old head node will have no active reference and it's memory will be get free  by java garbage collector 
		// no need to make head null deliberately
		
		
	}else {// deleting node from end or in the middle
		
		Node<T> previousNode=head;
		int count=1;
		while (count<position-2) {// stop previousNode pointer one node before the position node
			previousNode=previousNode.next;
			count++;
		}
		Node<T> currentNode=previousNode.next;
		previousNode.next=currentNode.next;
		currentNode=null;
		 
	}
	return ;	
}
	
	// Deleting a Specific Node from the list (delete a node whose data is equal to given input)
	public void deleteDataNode(T nodeData) {
		
		if(head==null) {
			System.out.println("List is Empty ! Please Insert Some node to it and try ");
			return;
		}
		
		

		Node<T> currentNode=head;
		Node<T> previousNode=head;
		
		if(currentNode.data.equals(nodeData)) {// in case if we need to delete in place of first element 
			
			head=currentNode.next;// here head is modified so need to Reassign
			return;
		}
		while(!currentNode.data.equals(nodeData)) {
			if(currentNode.next==null ) {
				System.out.println("No data found ! Please Insert valid node data ");
				return;
			}else{
				previousNode=currentNode;
				currentNode=currentNode.next;
			}
			
		}
		previousNode.next=currentNode.next;
		currentNode=null;
		return;
	}
	
	
	// Deleting a Specific Node from the list (deleteBeforeDataNode  whose data is equal to given input)
	public void deleteBeforeDataNode(T nodeData) {
		
		if(head==null) {
			System.out.println("List is Empty ! Please Insert Some node to it and try ");
			return;
		}

		Node<T> currentNode=head;
		Node<T> previousNode=head;
		Node<T> PreviousToPreviousNode=head;
	    if (currentNode.data.equals(nodeData)) {// if user gives first node to delete 
	    	System.out.println("Invalid Selection ! you can not delete before first node ,Please Insert valid node data ");
			return;
	    }
		while(!currentNode.data.equals(nodeData)) {
			if(currentNode.next==null ) {
				System.out.println("No data found ! Please Insert valid node data ");
				return;
			}else{
				PreviousToPreviousNode=previousNode;
				previousNode=currentNode;
				currentNode=currentNode.next;
			}
			
		}
        if(PreviousToPreviousNode==head &&currentNode.data.equals(nodeData)) {// need to change head if first node is going to delete 
        	head=PreviousToPreviousNode.next;
        	return;
        }
		PreviousToPreviousNode.next=currentNode;
		previousNode=null;
		return;
	}
	
	//  Deleting a Specific Node from the list (delete a node whose data is equal to given input)
		public void deleteAfterDataNode(T nodeData) {
			
			if(head==null) {
				System.out.println("List is Empty ! Please Insert Some node to it and try ");
				return;
			}

			Node<T> currentNode=head;
			
			while(!currentNode.data.equals(nodeData)) {
				if(currentNode.next==null ) {
					System.out.println("No data found ! Please Insert valid node data ");
					return;
				}else{
					currentNode=currentNode.next;
					
				}
				
			}
			
			
				Node<T> nextDataNode=currentNode.next;
				//null check of nextDataNode
				if(nextDataNode!=null) {// in case user want to delete element after last element ,it will give null pointer exception
					currentNode.next=nextDataNode.next;
					nextDataNode=null;
				
				}else {
				   System.out.println("Invalid selection ! Please Select valid  data node ");
			    }
			
			return;
		}
		
		//Node Using Static class
		public static class Node<T> {

			private T data;
			private Node<T> next;
			
			// constructor
			public Node(T data) {
					this.data = data;
			}
		}


	

}

