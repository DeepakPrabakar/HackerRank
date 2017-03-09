import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        
        /*
        for(int i=0;i<ar.length-1;i++) {
            for(int j=i;j>=0;j--) {
                 int temp = j+1;
                if(ar[j]>ar[temp]) {
                    int k =ar[j];
                    ar[j]=ar[temp];
                    ar[temp]=k;
                }
            }
             printArray(ar);
        }
        
        */
        // or
        
        for(int i=1;i<ar.length;i++){
            int temp=ar[i];
            int j=i-1;
            while(j>=0 && temp < ar[j]){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=temp;
            printArray(ar);
        }
    
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
