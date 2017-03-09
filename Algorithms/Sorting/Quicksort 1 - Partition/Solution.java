import java.util.*;
public class Solution {
       
          static void partition(int[] ar) {
            int p=ar[0];
              int left[] = new int[ar.length];
              int right[] = new int[ar.length];
              int k=0,j=0;
              for(int i=1;i<ar.length;i++) {
                  
                  if(ar[i]<p)left[j++]=ar[i];
                  else if(ar[i]>p)right[k++]=ar[i];
                  
              }
              printArray(left);
              System.out.print(p+" ");
              printArray(right);
       }   
 
      static void printArray(int[] ar) {
          for(int n: ar){
                if(n!=0)System.out.print(n+" ");
            }
         //   System.out.println("");
        }

      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
