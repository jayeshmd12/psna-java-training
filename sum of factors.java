import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum += i;
                
            }
        }
        System.out.println(sum);
    }
}
