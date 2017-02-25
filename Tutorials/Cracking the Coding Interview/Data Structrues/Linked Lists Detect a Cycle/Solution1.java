/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {

    if(head==null) return false;
    Node first = head.next;
    Node second = head;
    
    while(first !=null && first.next !=null && second !=null)
    {
        if(first==second)
            return true;
        
        first= first.next.next;
        second = second.next;
            
    }
    return false;
}
