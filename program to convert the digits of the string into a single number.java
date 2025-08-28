import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    public static void main(String args[] ) throws Exception {
     Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder digits = new StringBuilder();

        for(int i=0;i<a.length();i++){
            char c =a.charAt(i);
            if(c>=48 && c<=57){
             digits.append(c);  

            }
        }
       
        if (digits.length() > 0) {
            System.out.print(digits.toString());
        } else {
            System.out.print(0);
        }
           
            
        
    }
}
