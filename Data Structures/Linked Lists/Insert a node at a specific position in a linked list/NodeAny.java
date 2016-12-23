/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    
    Node temp =new Node();
    
    temp.data = data;
    temp.next = null;
    
    if(head==null)
    {
        head=temp;
        return head;
    }
    if(position == 0)
    { 
            temp.next=head;
            head=temp;
            return head;
    }
     else
    {
         Node start=head;
         Node prev=null;
         while(position > 0)
         {
             prev=start;
             start=start.next;
             position--;
         }
         temp.next=prev.next;
         prev.next=temp;
         return head;
     }

}
