/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

/*

*/
void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
  
    //using stack
    /*
    Stack<Integer> stack=new Stack();
    
    Node start=head;
        while(start!=null)
        {
            stack.push(start.data);
            start=start.next;
        }
        
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());   
        }
      */
    
    //Using recurrsion
    if(head == null)
        return;

    ReversePrint(head.next);
    System.out.println(head.data);

}
