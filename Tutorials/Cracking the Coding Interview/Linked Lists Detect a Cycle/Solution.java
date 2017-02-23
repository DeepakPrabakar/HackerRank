/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {

    Node start = head;
    Map<Node,Integer> map = new HashMap<>();
    
    while(start !=null)
    {
        if(!map.containsKey(start))
            map.put(start,start.data);
        else
            return true;
        
        start= start.next;
            
    }
    return false;
}
