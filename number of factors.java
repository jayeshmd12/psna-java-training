import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
        int count=0;
    for(int i=1;i<=a;i++){
        if(a%i==0){
            count++;
        }
    }
        System.out.println(count);
    }
}
