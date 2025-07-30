import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        
        if (a < 1 || a > 12) {
            System.out.println("Invalid");
            return;
        }
        
        String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        
        System.out.println(months[a]); // Use println
    }
}
