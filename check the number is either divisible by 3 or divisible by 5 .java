import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a;
        a =sc.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println("HiHello");
        }
        else if(a%3==0){
            System.out.println("Hi");
        }
        else if(a%5==0){
            System.out.println("Hello");
        }
    }
}
