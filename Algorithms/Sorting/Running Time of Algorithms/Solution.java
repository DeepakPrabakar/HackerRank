import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int insertionSort(int arr[]) {
        int count=0;
        for(int i=1;i<arr.length;i++) {
            int temp =arr[i];
            int j=i-1;
            while(j>=0 && temp < arr[j]) {
                arr[j+1] = arr[j];
                j--;
                count++;
            }
            arr[j+1]= temp;
        }
        return count;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        
        int count = insertionSort(arr);
        System.out.println(count);
    }
}