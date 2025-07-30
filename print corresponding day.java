import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n<0 || n>6)
        {
            System.out.print("Invalid");
            return;
        }
        String arr[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        
        System.out.print(arr[n]);
        
    }
}
