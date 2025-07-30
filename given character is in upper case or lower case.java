import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char a =sc.next().charAt(0);
        if(a>='a' && a<='z'){
            System.out.println("LOWERCASE");
        }
        else if(a>='A' && a<='Z'){
            System.out.println("UPPERCASE");
        }
    }
}
      
