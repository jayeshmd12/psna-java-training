import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                
                System.out.print(" "); 
            } else {
                System.out.print(c); 
            }
        }
    }
}
