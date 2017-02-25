package com.rajeev.dsa.linkedlist;

import java.util.Scanner;

public class DLLTest {

	public static void main(String[] args) {
		Dll<Integer> dll=new Dll<Integer>();
		
		System.out.println("Singly Linked List Test\n"); 
		int choice;
		Scanner scan = new Scanner(System.in);
		
		
        System.out.println("Integer values and it's corresponding SinglyLinkedList Operations details");
        System.out.println("1. insert at begining");
        System.out.println("2. insert at end");
        System.out.println("3. insert at position");
        System.out.println("4. insert after given data node");
        
        System.out.println("5. delete at begining");
        System.out.println("6. delete at end");
        System.out.println("7. delete at position");
        System.out.println("8. delete given data node");
        
        System.out.println("9. check empty");
        System.out.println("10. get size");
        System.out.println("11. display list");
        System.out.println("12. exit ");
        
        System.out.println("13. Reverse print ");
        
        System.out.println("\n Choose any of above integer value to perform corresponding SinglyLinkedList Operations ");
		do
	    {
	        
	        choice = scan.nextInt();            
	        switch (choice)
	        {
	        case 1 : 
	            System.out.println("Enter integer element to insert");
	            int data=scan.nextInt();
	            Dll.Node<Integer> newNode=new Dll.Node<Integer>(data);
	            dll.insertFront(newNode);
	            break;                          
	        /*case 2 : 
	            System.out.println("Enter integer element to insert");
	            data=scan.nextInt();
	            newNode=new SLLNode<Integer>(data);
	            sll.insertLast(newNode);
	            break;                         
	        case 3 : 
	            System.out.println("Enter integer element to insert");
	            data = scan.nextInt() ;
	            System.out.println("Enter position");
	            int pos = scan.nextInt() ;
	            newNode=new SLLNode<Integer>(data);
	            sll.insertAtPos(newNode, pos);
	            break; 
	        case 4 : 
	            System.out.println(" Enter the node data after which you want to insert the new node ");
	            data = scan.nextInt() ;
	            System.out.println("Enter insertNode data value ");
	            int insertNodeData = scan.nextInt() ;
	            newNode=new SLLNode<Integer>(insertNodeData);
	            sll.insertAfter(data, newNode);
	            break; 
	        case 5 : 
	            System.out.println("deleting from begining");
	           // sll.setHead(sll.deleteFromBegining(sll.getHead()));
	            sll.deleteFront();
	            break;
	        case 6 :      
	        	//System.out.println("deleting from end"+sll.deleteFromEnd(sll.getHead()));
	        	sll.deleteLast();
	        	break;
	        case 7 : 
	            System.out.println("Enter position");
	            pos = scan.nextInt();
	            sll.deleteAtPos(pos);
	            break;
	        case 8 : 
	            System.out.println("Enter the node data which you want to delete");
	            data = scan.nextInt();
	            sll.deletDataNode(data);
	            break;*/
	        case 9 : 
	        	boolean isEmpty=dll.isEmpty();
	        	 System.out.println("Empty status = "+isEmpty);
	            break;                   
	        case 10 : 
	           System.out.println("Size = "+ dll.listLength()+" \n");
	           break;  
	            
	        case 11 : 
	        	/*  Display List  */ 
	        	dll.display();
	            break; 
	        case 12 : 
	        	/*  Display List  */ 
	        	 scan.close();
	        	 System.exit(1);
	            break; 
	        case 13 :
	        	dll.reverseDisplay();
	        	break;
	         default : 
	            System.out.println("Wrong Entry");
	            break;   
	        }
	       System.out.println("\n choose next operation int value");
	                               
	    } while (true); 
		
		
		
		
	}

}
