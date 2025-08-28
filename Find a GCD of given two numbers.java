import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
           int min = Math.min(num1, num2);
        while(min>=2){
            if(num2%min==0 && num1%min==0){
                System.out.print("GCD of two number is " + min);
                break;
            }
               min--;
        }
    }
}

              
