import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3,n4,n5,n6;
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=++n1;
        n4=n2++;
        n5=n1++;
        n6=n2++;
        System.out.println("Pre increment:" + n3);
        System.out.println("Post increment:" + n4);
         System.out.println("Final values:" + n5 +" " + n6);
        
        
    }
}
