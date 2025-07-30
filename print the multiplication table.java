import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,a;
        a=sc.nextInt();
        n=sc.nextInt();
        for(i=1;i<=a;i++){
            System.out.println(i + " * " + n + " = " + (i*n));
        }
    }
}
