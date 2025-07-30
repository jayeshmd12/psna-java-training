import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine(); // Read time as a string
        sc.close();

        String[] parts = time.split(":");

        if (parts.length != 3) {
            System.out.println("Not Valid");
            return;
        }

        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        int ss = Integer.parseInt(parts[2]);

        if (hh >= 0 && hh < 24 && mm >= 0 && mm < 60 && ss >= 0 && ss < 60) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
