package com.rajeev.dsa.linkedlist;

import java.util.Scanner;


public class SLLTest {
	public static void main(String[] args) {
		SLL<Integer> sll=new SLL<Integer>();
		
		System.out.println("Singly Linked List Test\n"); 
		int choice;
		Scanner scan = new Scanner(System.in);
		
		
        System.out.println("Integer values and it's corresponding SinglyLinkedList Operations details");
        // Insert
        System.out.println("1. insert at begining");
        System.out.println("2. insert at end");
        System.out.println("3. insert at given position");
        System.out.println("4. insert after given position");
        System.out.println("5. insert before given position");
        System.out.println("6. insert at given data node");
        System.out.println("7. insert after given data node");
        System.out.println("8. insert Before given data node");
        // delete
        System.out.println("9.  delete at begining");
        System.out.println("10. delete at end");
        System.out.println("11. delete at position");
        System.out.println("12. delete after given position");
        System.out.println("13. delete before given position");
        System.out.println("14. delete given data node");
        System.out.println("15. delete node after given data node");
        System.out.println("16. delete node before given data node");
        
        
        System.out.println("17. check empty");
        System.out.println("18. get size");
        System.out.println("19. display list");
        System.out.println("20. exit ");
        System.out.println("\n Choose any of above integer value to perform corresponding SinglyLinkedList Operations ");
		do
	    {
	        
	        choice = scan.nextInt();            
	        switch (choice)
	        {
	        case 1 : 
	            System.out.println("Enter integer element to insert");
	            int data=scan.nextInt();
	            // Create Node Using Static class
	            SLL.Node<Integer> newNode=new SLL.Node<Integer>(data);
	           
	            sll.insertFront(newNode);
	            break;                          
	        case 2 : 
	            System.out.println("Enter integer element to insert");
	            data=scan.nextInt();
	           
	            newNode=new SLL.Node<Integer>(data);
	            sll.insertLast(newNode);
	            break;                         
	        case 3 : 
	            System.out.println("Enter integer element to insert");
	            data = scan.nextInt() ;
	            System.out.println("Enter position");
	            int pos = scan.nextInt() ;
	            
	            newNode=new SLL.Node<Integer>(data);
	            sll.insertAtPosition(newNode, pos);
	            break; 
	        case 4 : 
	            System.out.println("Enter integer element to insert");
	            data = scan.nextInt() ;
	            System.out.println("Enter position");
	             pos = scan.nextInt() ;
	            
	             newNode=new SLL.Node<Integer>(data);
	            sll.insertAfterPosition(newNode, pos);
	            break; 	  
	        case 5 : 
	            System.out.println("Enter integer element to insert");
	            data = scan.nextInt() ;
	            System.out.println("Enter position");
	             pos = scan.nextInt() ;
	            
	             newNode=new SLL.Node<Integer>(data);
	            sll.insertBeforePosition(newNode, pos);
	            break; 	
	       case 6 : 
	            System.out.println(" Enter the node data at which you want to insert the new node ");
	            data = scan.nextInt() ;
	            System.out.println("Enter the data value for new node which will get inserted ");
	            int insertNodeData = scan.nextInt() ;
	            
	            newNode=new SLL.Node<Integer>(insertNodeData);
	            sll.insertAtDataNode(data, newNode);
	            break; 
	        case 7 : 
	            System.out.println(" Enter the node data after which you want to insert the new node ");
	            data = scan.nextInt() ;
	            System.out.println("Enter insertNode data value ");
	             insertNodeData = scan.nextInt() ;
	            
	            newNode=new SLL.Node<Integer>(insertNodeData);
	            sll.insertAfterDataNode(data, newNode);
	            break; 
	        case 8 : 
	            System.out.println(" Enter the node data after which you want to insert the new node ");
	            data = scan.nextInt() ;
	            System.out.println("Enter insertNode data value ");
	             insertNodeData = scan.nextInt() ;
	            
	             newNode=new SLL.Node<Integer>(insertNodeData);
	            sll.insertBeforeDataNode(data, newNode);
	            break; 
	            
	            
	            
	            
	        case 9 : 
	            System.out.println("deleting from begining");
	         
	            sll.deleteFront();
	            break;
	        case 10 :      
	        
	        	sll.deleteLast();
	        	break;
	        case 11 : 
	            System.out.println("Enter position");
	            pos = scan.nextInt();
	            sll.deleteAtPosition(pos);
	            break;
	        case 12 : 
	            System.out.println("Enter position");
	            pos = scan.nextInt();
	            sll.deleteAfterPosition(pos);
	            break;
	        case 13 : 
	            System.out.println("Enter position");
	            pos = scan.nextInt();
	           sll.deleteBeforePosition(pos);
	            break;
	        case 14 : 
	            System.out.println("Enter the node data which you want to delete");
	            data = scan.nextInt();
	            sll.deleteDataNode(data);
	            break;
	        case 15 : 
	            System.out.println("Enter the node data which you want to delete");
	            data = scan.nextInt();
	            sll.deleteAfterDataNode(data);
	            break;
	        case 16 : 
	            System.out.println("Enter the node data Before which you want to delete node");
	            data = scan.nextInt();
	            sll.deleteBeforeDataNode(data);
	            break;
	        case 17 : 
	        	boolean isEmpty=sll.isEmpty();
	        	 System.out.println("Empty status = "+isEmpty);
	            break;                   
	        case 18 : 
	           System.out.println("Size = "+ sll.listLength()+" \n");
	           break;  
	            
	        case 19 : 
	        	/*  print List  */ 
	        	 sll.display();
	            break; 
	        case 20 : 
	        	/*  print List  */ 
	        	 scan.close();
	        	 System.exit(1);
	            break; 
	         default : 
	            System.out.println("Wrong Entry");
	            break;   
	        }
	       System.out.println("\n choose next operation int value");
	                               
	    } while (true); 
		
		
		
		
	}

}
