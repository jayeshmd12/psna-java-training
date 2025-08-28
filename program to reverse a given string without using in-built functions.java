import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
        String ans="";
        for(int i=a.length()-1;i>=0;i--){
            ans += a.charAt(i);
        }
        System.out.println(ans);
    }
}
