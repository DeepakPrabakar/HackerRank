/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    
    if(head==null)
        return null;
    else
    {
        if(position ==0)
        {
            head=head.next;
            return head;
        }
        else
        {
            Node start =head;
            Node prev=null;
            while (position >0)
            {
                prev=start;
                start=start.next;
                position--;
            }
            prev.next=start.next;
            return head;
        }
            
    }

}

