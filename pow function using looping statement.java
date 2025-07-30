import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b,result=1;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<=b;i++){
            result *= a;
            }
         System.out.println(result);
        sc.close();
    }
}
   
