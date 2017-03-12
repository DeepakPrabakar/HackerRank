import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{    
    private Node parent;
    int descendantCount = 0;
    void setParent(Node parent){
        this.parent = parent;
        Node ancestor = parent;
        while(ancestor != null){
            ancestor.descendantCount ++;
            ancestor = ancestor.getParent();
        }
    }
    Node getParent(){
        return this.parent;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s = new Scanner(System.in);
        int vertices = s.nextInt();
        int edges = s.nextInt();
        Node[] nodes = new Node[vertices];
        while (vertices -- > 0)
            nodes[vertices] = new Node();
        while(edges -- > 0)
            nodes[s.nextInt()-1]
               .setParent(nodes[s.nextInt()-1]);
        int disconnects = -1;
        for(Node n:nodes)
            if(n.descendantCount % 2 == 1)
                disconnects++;
        System.out.println(disconnects);
    }
}