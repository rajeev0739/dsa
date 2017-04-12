package com.rajeev.dsa.linkedlist;

public class Dll<T> {

	private transient Node<T> head;


	public Node<T> getNode(T dataToInsert) {
		return	new Dll.Node<T>(dataToInsert);
	}
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
		System.out.print("head<-null");
		
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
			NodeToInsert.next=head;
			head.previous=NodeToInsert;
			head=NodeToInsert;
		}
		return;
	}
	
	public void insertFront(T dataToInsert) {
		Node<T> nodeToInsert=getNode(dataToInsert);
		insertFront(nodeToInsert);
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
	
	public void insertLast(T dataToInsert) {
		Node<T> nodeToInsert=getNode(dataToInsert);
		insertLast(nodeToInsert);
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
	
	public void insertAtPosition(T dataToInsert,long position) {
		Node<T> nodeToInsert=getNode(dataToInsert);
		insertAtPosition(nodeToInsert,position);
	}
	
	public void insertAfterPosition(Node<T> NodeToInsert,long position) {
		// suppose after inserting the position of this new Node is p
	    // In list with three elements 1,2,3 if we insert 4 at position 2 then new list will be like this 1,4,2,3 
		
		int size=listLength();
		if(head==null || position>size || position<1 ) {
			if(head==null)
				System.out.println("List is empty");
			else 
				System.out.println(" Invalid Position , Valid position is 1 to "+size);
			return;
		}
		
		// Insertion of Node possible only in the middle or end 
			Node<T> positionNode=head;
	    	int count=1;
	    	while (count<position) {// stop  pointer at position Node ,when count will be one positionNode is at head ,when count will be 2 ,positionNode will be on 1st node and so on.
	    		positionNode=positionNode.next;
	    		count++;
	    	}
	    	Node<T> afterPositionNode=positionNode.next;
	    	if(null!=afterPositionNode) {
	    		afterPositionNode.previous=NodeToInsert;
	    	}
	    	positionNode.next=NodeToInsert;
	    	NodeToInsert.next=afterPositionNode;
	    	NodeToInsert.previous=positionNode;
	    	return;
	    
	}
	
	
	public void insertAfterPosition(T dataToInsert,long position) {
		Node<T> nodeToInsert=getNode(dataToInsert);
		insertAfterPosition(nodeToInsert, position);
		
	}
	
	public void insertBeforePosition(Node<T> NodeToInsert,long position) {
		insertAtPosition(NodeToInsert, position);// same as insert at position
		return;
	}
	
	
	public void insertBeforePosition(T dataToInsert,long position) {
		Node<T> nodeToInsert=getNode(dataToInsert);
		insertBeforePosition(nodeToInsert,position);
		
	}
	
// Insert at Specific  Node in the list (insert at a Node whose data is equal to given input)
	public void insertAtData(T NodeData,Node<T> NodeToInsert) {
		if(head==null) {
			System.out.println("List is Empty ! Please Insert Some Node to it and try ");
			return;
		}
		
		Node<T> currentNode=head;
		// if insert at first node needed then update head as well
		if(currentNode.data.equals(NodeData)) {
			NodeToInsert.next=currentNode;
			NodeToInsert.previous=head;
			head=NodeToInsert;
			return;
		}
		
		// insert at end or middle
		while(!currentNode.data.equals(NodeData)) {
			if(currentNode.next==null ) {
				System.out.println("No data found ! Please Insert valid Node data ");
				return;
			}else{
				currentNode=currentNode.next;
			}
			
		}
		Node<T> previousNode=currentNode.previous;
		
		NodeToInsert.next=currentNode;
		NodeToInsert.previous=previousNode;
		previousNode.next=NodeToInsert;
		currentNode.previous=NodeToInsert;
		return;
   }

			
	public void insertAtData(T NodeData,T dataToInsert) {
		Node<T> nodeToInsert=getNode(dataToInsert);
		insertAtData(NodeData,nodeToInsert);
		
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
			
			Node<T> afterPositionNode=currentNode.next;
			if(null!=afterPositionNode){// if need to insert after last node
				afterPositionNode.previous=NodeToInsert;
			}
			
			NodeToInsert.next=afterPositionNode;
			NodeToInsert.previous=currentNode;
			currentNode.next=NodeToInsert;
			return;
		}
		
		
		public void insertAfterData(T NodeData,T dataToInsert) {
			Node<T> nodeToInsert=getNode(dataToInsert);
			insertAfterData(NodeData,nodeToInsert);
		}
		// Insert After Specific  Node in the list (insert after a Node whose data is equal to given input)
		public void insertBeforeData(T NodeData,Node<T> NodeToInsert) {
			insertAtData(NodeData, NodeToInsert);
			return;
		}
		
		public void insertBeforeData(T NodeData,T dataToInsert) {
			Node<T> nodeToInsert=getNode(dataToInsert);
			insertBeforeData(NodeData,nodeToInsert);
		}
		
		
		public void deleteList() {
			Node<T> iterator=head,tempNode;
			while(iterator!=null) {
				tempNode=iterator.next;
				// Since In java only those Node objects will get garbage collected who doesn't have any active reference ,and since each node next and previous have reference of it's next and previous node ,
				//so we need to make next and previous of each node null as well.
				iterator.next=null;
				iterator.previous=null;
				iterator=tempNode;
				
			}
			return;
		}
		
		// delete the doubly linked list node from front
		
		public void deleteFront() {
					
			if(head==null) {
				System.out.println("List is Empty!");
				return;
				
			}
			
			Node<T> secondNode=head.next;
			head.next=null;// even though we will not do it specifically the java garbage collector will release the first node memory ,however it's better to make it null;
			head=secondNode;
			if(secondNode!=null){
				secondNode.previous=head;
			}
			
			
		}
		public void deleteLast() {
			
			if(head==null) {
				System.out.println("List is Empty!");
				return;
				
			}
			
			Node<T> currentNode=head;
			while(currentNode.next!=null) {
				currentNode=currentNode.next;
				
			}
			Node<T> secondLastNode=currentNode.previous;
			if(null!=secondLastNode) {
				secondLastNode.next=null;
			}else {
				//if there is no 2nd last node it means there is only one node in the list in that case if you want to delete the node 
				//you need to change head to null as well ,it will similar as  deleting 1st node 
				head=null;
			}
			currentNode.previous=null;
			
		}
		
		public void deleteAtPosition(int position) {
			int size=listLength();
			
			if(head==null) {
				System.out.println("List is Empty!");
				return;
				
			}
			if(position<1 || position>size) {
				System.out.println("Invalid position  ! please enter valid position is between 1 to "+size);
				return;
			}
			
			if(position==1) {
				// delete from front 
				Node<T> secondNode=head.next;
				head.next=null;// even though we will not do it specifically the java garbage collector will release the first node memory ,however it's better to make it null;
				head=secondNode;
				if(secondNode!=null)
					secondNode.previous=head;
				return;
			}
			
			int count=1;
			
			Node<T>  positionNode=head;
			while(count<position) {
				positionNode=positionNode.next;
				count++;
			}
			Node<T> previousToPositionNode=positionNode.previous;
			Node<T> AfterPositionNode=positionNode.next;
			previousToPositionNode.next=AfterPositionNode;
			if(AfterPositionNode!=null)
				AfterPositionNode.previous=previousToPositionNode;
			
			
		}
		
		public void deleteAfterPosition(int position) {
			int size=listLength();
			
			if(head==null) {
				System.out.println("List is Empty!");
				return;
				
			}
			if(position<1 || (position>size-1 && position!=1)) {
				System.out.println("Invalid position  ! please enter valid position is between 1 to "+(size-1));
				return;
			}
			
			if(position==1) {
				// delete from front 
				Node<T> secondNode=head.next;
				//head=null; even though we will not do it specifically the java garbage collector will release the first node memory ,however it's better to make it null;
				Node<T> thirdNode=secondNode.next;
				thirdNode.previous=head;
				head.next=thirdNode;
				
				if(secondNode!=null) {
					secondNode.previous=null;
					secondNode.next=null;
					secondNode=null;
				}
				return;
			}
			
			int count=1;
			
			Node<T>  positionNode=head;
			while(count<position) {
				positionNode=positionNode.next;
				count++;
			}
			
			Node<T> AfterPositionNode=positionNode.next;
			
			if(AfterPositionNode!=null) {
				Node<T> NextToAfterPositionNode=AfterPositionNode.next;
				positionNode.next=NextToAfterPositionNode;
				if(null!=NextToAfterPositionNode)
				NextToAfterPositionNode.previous=positionNode;
				
				//java will take care of below so even if we don't give below 3 statement it will be good
				AfterPositionNode=null;
				
				
			}
			
			
		}
		
		public void deleteBeforePosition(int position) {
			int size=listLength();
			
			if(head==null) {
				System.out.println("List is Empty!");
				return;
				
			}
			if(position<2 || (position>size)) {
				System.out.println("Invalid position  ! please enter valid position is between 1 to "+(size));
				return;
			}
			
			if(position==2) {
				// delete from front 
				Node<T> secondNode=head.next;
				head=secondNode;
				return;
			}
			
			int count=1;
			
			Node<T>  positionNode=head;
			while(count<position) {
				positionNode=positionNode.next;
				count++;
			}
			
			Node<T> BeforePositionNode=positionNode.previous;
			
				if(BeforePositionNode!=null) {
					Node<T> BeforeToBeforePositionNode=BeforePositionNode.previous;
					if(null!=BeforeToBeforePositionNode) {
						BeforeToBeforePositionNode.next=positionNode;
						positionNode.previous=BeforeToBeforePositionNode;
					}
					BeforePositionNode=null;
				}
				
		}
		
		
	
		
		// Deleting a Specific Node from the list (delete a node whose data is equal to given input)
		public void deleteDataNode(T nodeData) {
			
			if(head==null) {
				System.out.println("List is Empty ! Please Insert Some node to it and try ");
				return;
			}
			
			

			Node<T> currentNode=head;
			Node<T> previousToDataNode=null;
			Node<T> afterDataNode=null;
			
			if(currentNode.data.equals(nodeData)) {// in case if we need to delete in place of first element 
				
				head=currentNode.next;// here head is modified so need to Reassign
				return;
			}
			while(!currentNode.data.equals(nodeData)) {
				if(currentNode.next==null ) {
					System.out.println("No data found ! Please Insert valid node data ");
					return;
				}else{
					
					currentNode=currentNode.next;
				}
				
			}
			previousToDataNode=currentNode.previous;
			
			afterDataNode=currentNode.next;
			previousToDataNode.next=afterDataNode;
			if(null!=afterDataNode) {
				afterDataNode.previous=previousToDataNode;
			}
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
			Node<T> previousNode=null;
			Node<T> PreviousToPreviousNode=null;
		    if (currentNode.data.equals(nodeData)) {// if user gives first node to delete 
		    	System.out.println("Invalid Selection ! you can not delete before first node ,Please Insert valid node data ");
				return;
		    }
			while(!currentNode.data.equals(nodeData)) {
				if(currentNode.next==null ) {
					System.out.println("No data found ! Please Insert valid node data ");
					return;
				}else{
					
					currentNode=currentNode.next;
				}
				
			}
			
			previousNode=currentNode.previous;
			PreviousToPreviousNode=previousNode.previous;
			
	        if(previousNode==head &&currentNode.data.equals(nodeData)) {// need to change head if first node is going to delete 
	        	head=previousNode.next;
	        	return;
	        }
	        if(null!=PreviousToPreviousNode)
			PreviousToPreviousNode.next=currentNode;
			currentNode.previous=PreviousToPreviousNode;
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
				
				
					Node<T> nextToDataNode=currentNode.next;
					//null check of nextDataNode
					if(nextToDataNode!=null) {// in case user want to delete element after last element ,it will give null pointer exception
						Node<T> nextToNextDataNode=nextToDataNode.next;
						currentNode.next=nextToNextDataNode;
						if(null!=nextToNextDataNode)
							nextToNextDataNode.previous=currentNode;
						nextToDataNode=null;
					
					}else {
					   System.out.println("Invalid selection ! Please Select valid  data node ");
				    }
				
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
