import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
     static int local=0;
     static int MAX=0;
     static int ROW = 0, COL = 0;
     public static boolean isSafe(int[][] matrix, int row, int col,
            boolean visited[][]) {
 
        return (row >= 0 && row < ROW && col >= 0 && col < COL
                && matrix[row][col] == 1 && !visited[row][col]);
    }
 
    public static void DFS(int[][] matrix, int row, int col, boolean visited[][]) {
 
        int rowNums[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int colNums[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
 
        visited[row][col] = true;
        local++;
   //      System.out.println(row+" - "+col);
 
        for (int i = 0; i < 8; i++) {
  
            if (isSafe(matrix, row + rowNums[i], col + colNums[i], visited)) {
 
                DFS(matrix, row + rowNums[i], col + colNums[i], visited);
               
            }
        }
  
     //   System.out.println("-----");
  
    }
    public static void getBiggestRegion(int[][] matrix) {
          boolean[][] visited = new boolean[ROW][COL];
 
        int count = 0;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
 
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    DFS(matrix, i, j, visited);
                    count++;
                    if (local > MAX)
                    MAX = local;
                    local = 0;
  
                }
            }
 
        }
       // return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        ROW = n;
        COL = m;
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        getBiggestRegion(grid);
        System.out.println(MAX);
        
    }
}
