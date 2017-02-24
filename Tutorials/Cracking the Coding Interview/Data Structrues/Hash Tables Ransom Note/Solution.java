import java.util.*;
import java.util.Map.Entry;

public class Solution {
    Map<String, Integer> magazineMap = new HashMap<>();
    Map<String, Integer> noteMap = new HashMap<>();;
    
    public Solution(String magazine, String note) {
        
        String mg[] = magazine.split(" ");
        String nt[] = note.split(" ");
        
        for(String s: mg)
        {
            if(!magazineMap.containsKey(s))
                magazineMap.put(s,1);    
            else
                magazineMap.put(s,magazineMap.get(s)+1);    
        }
        
        for(String s: nt)
        {
            if(!noteMap.containsKey(s))
                noteMap.put(s,1);    
            else
                noteMap.put(s,noteMap.get(s)+1);    
        }
    }
    
    public boolean solve() {
        
       int count =0;
        for(Entry<String, Integer> entry: noteMap.entrySet())
        {
            if(magazineMap.containsKey(entry.getKey()))
            {
                if(entry.getValue()<=magazineMap.get(entry.getKey()))
                    count++;
                else return false;
            }
        }
        
        return true;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
