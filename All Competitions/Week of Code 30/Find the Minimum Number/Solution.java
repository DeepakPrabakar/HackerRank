import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String append="min(int, ";
        String res="min(int, int)";
        for(int i=3;i<=n;i++) {
            res = append+res+")";
        }
        System.out.println(res);
    }
}
