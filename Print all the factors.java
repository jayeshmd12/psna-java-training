import java.util.*;

public class Solution {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // Input number
        boolean first = true;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {  // Only factors
                if (!first) {
                    System.out.print(",");
                }
                System.out.print(i);
                first = false;
            }
        }

        sc.close();
    }
}
