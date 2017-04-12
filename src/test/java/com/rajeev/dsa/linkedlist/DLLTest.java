package com.rajeev.dsa.linkedlist;

import java.util.Scanner;

public class DllTest {

	public static void main(String[] args) {
		Dll<Integer> dll=new Dll<Integer>();
		
		System.out.println("Singly Linked List Test\n"); 
		int choice;
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Integer values and it's corresponding DoublyLinkedList Operations details");
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
	        System.out.println("12. delete after given posit1ion");
	        System.out.println("13. delete before given position");
	        System.out.println("14. delete given data node");
	        System.out.println("15. delete node beofre given data node");
	        System.out.println("16. delete node after given data node");
	        System.out.println("17. delete whole List");
	        
	        System.out.println("18. check empty");
	        System.out.println("19. get size");
	        System.out.println("20. display list");
	        System.out.println("21. display reverse DoublyLinkedList");
	        
	        System.out.println("22. exit ");
	        System.out.println("\n Choose any of above integer value to perform corresponding DoublyLinkedList Operations ");
        
    
		do
	    {
	        
			 choice = scan.nextInt();            
		        switch (choice)
		        {
		        case 1 : 
		            System.out.println("Enter integer element to insert");
		            int data=scan.nextInt();
		            /* Create Node Using Static class
		            Dll.Node<Integer> newNode=new Dll.Node<Integer>(data);
		           
		            dll.insertFront(newNode);
		            */
		            dll.insertFront(data);
		            break;                          
		        case 2 : 
		            System.out.println("Enter integer element to insert");
		            data=scan.nextInt();
		            dll.insertLast(data);
		            /*newNode=new Dll.Node<Integer>(data);
		            dll.insertLast(newNode);*/
		            break;                         
		        case 3 : 
		            System.out.println("Enter integer element to insert");
		            data = scan.nextInt() ;
		            System.out.println("Enter position");
		            int pos = scan.nextInt() ;
		            dll.insertAtPosition(data, pos);
		            /*newNode=new Dll.Node<Integer>(data);
		            dll.insertAtPosition(newNode, pos);*/
		            break; 
		        case 4 : 
		            System.out.println("Enter integer element to insert");
		            data = scan.nextInt() ;
		            System.out.println("Enter position");
		             pos = scan.nextInt() ;
		             dll.insertAfterPosition(data,pos);
		             /*newNode=new Dll.Node<Integer>(data);
		               dll.insertAfterPosition(newNode, pos);*/
		            break; 	  
		        case 5 : 
		            System.out.println("Enter integer element to insert");
		            data = scan.nextInt() ;
		            System.out.println("Enter position");
		            pos = scan.nextInt() ;
		            dll.insertBeforePosition(data, pos);
		            /*newNode=new Dll.Node<Integer>(data);
		            dll.insertBeforePosition(newNode, pos);*/
		            break; 	
		       case 6 : 
		            System.out.println(" Enter the node data at which you want to insert the new node ");
		            data = scan.nextInt() ;
		            System.out.println("Enter the data value for new node which will get inserted ");
		            int insertNodeData = scan.nextInt() ;
		            dll.insertAtData(data, insertNodeData);
		            /*newNode=new Dll.Node<Integer>(insertNodeData);
		            dll.insertAtDataNode(data, newNode);*/
		            break; 
		        case 7 : 
		            System.out.println(" Enter the node data after which you want to insert the new node ");
		            data = scan.nextInt() ;
		            System.out.println("Enter insertNode data value ");
		             insertNodeData = scan.nextInt() ;
		             dll.insertAfterData(data, insertNodeData);
		          /*  newNode=new Dll.Node<Integer>(insertNodeData);
		            dll.insertAfterDataNode(data, newNode);*/
		            break; 
		        case 8 : 
		            System.out.println(" Enter the node data after which you want to insert the new node ");
		            data = scan.nextInt() ;
		            System.out.println("Enter insertNode data value ");
		             insertNodeData = scan.nextInt() ;
		             dll.insertBeforeData(data, insertNodeData);
		             /*newNode=new Dll.Node<Integer>(insertNodeData);
		             dll.insertBeforeDataNode(data, newNode);*/
		            break; 
		            
		            
		            
		            
		        case 9 : 
		            System.out.println("deleting from begining");
		         
		            dll.deleteFront();
		            break;
		        case 10 :      
		        
		        	dll.deleteLast();
		        	break;
		        case 11 : 
		            System.out.println("Enter position");
		            pos = scan.nextInt();
		            dll.deleteAtPosition(pos);
		            break;
		        case 12 : 
		            System.out.println("Enter position");
		            pos = scan.nextInt();
		           dll.deleteAfterPosition(pos);
		            break;
		        case 13 : 
		            System.out.println("Enter position");
		            pos = scan.nextInt();
		           dll.deleteBeforePosition(pos);
		            break;
		        case 14 : 
		            System.out.println("Enter the node data which you want to delete");
		            data = scan.nextInt();
		           dll.deleteDataNode(data);
		            break;
		        case 15 : 
		            System.out.println("Enter the node data before which you want to delete");
		            data = scan.nextInt();
		            dll.deleteBeforeDataNode(data);
		           
		            break;
		        case 16 : 
		            System.out.println("Enter the node data after which you want to delete node");
		            data = scan.nextInt();
		            dll.deleteAfterDataNode(data);
		            break;
		        case 17 : 
		            System.out.println("deleting the list ");
		            //dll.d
		            
		            break;
		        case 18 : 
		        	boolean isEmpty=dll.isEmpty();
		        	 System.out.println("Empty status = "+isEmpty);
		            break;                   
		        case 19 : 
		           System.out.println("Size = "+ dll.listLength()+" \n");
		           break;  
		            
		        case 20 : 
		        	/*  print List  */ 
		        	 dll.display();
		            break; 
		        case 21 : 
		        	/*  print List in Reverse order */ 
		        	 dll.reverseDisplay();
		            break; 
		        case 22 : 
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
