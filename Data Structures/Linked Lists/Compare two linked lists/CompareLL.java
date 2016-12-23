/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
//solution 1
/*
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    
    if(headA == null || headB == null)
        return 0;
    
    int ac=0;
    Node startA=headA;
    Node startB=headB;
    
    while(headA != null)
    {
        ac++;
        headA=headA.next;    
    }
    int bc=0;
    
    while(headB != null)
    {
        bc++;
        headB=headB.next;    
    }
    
    if(ac!=bc)
        return 0;
    while(startA != null && startB != null)
    {
        if(startA.data != startB.data)
            return 0;
        startA = startA.next;
        startB = startB.next;
        
    }
    
    return 1;
    
    
}

*/
//solution 2
int CompareLists(Node headA, Node headB) {
    while (headA !=null && headB !=null && (headA.data == headB.data)) {
        headA = headA.next;
        headB = headB.next;
    }
    return (headA == headB)? 1:0;
}


//solution 3
/*
int CompareLists(Node headA, Node headB) {
    if (headA == null && headB == null) {
        return 1;
    }
    if (headA == null || headB == null || headA.data != headB.data) {
        return 0;
    }
    return CompareLists(headA.next, headB.next);
}
*/
