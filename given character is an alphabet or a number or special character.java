import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        
        if (a >= '0' && a <= '9') {
            System.out.println("NUMBER");
        } else if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
            System.out.println("ALPHABET");
        } else {
            System.out.println("SPECIAL CHARACTER");
        }

        sc.close();
    }
}
