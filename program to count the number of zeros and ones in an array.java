import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int zeroCount = 0;
        int oneCount=0;
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
        if(a[i]==0){
            zeroCount++;
        }
        else if(a[i]==1){
            oneCount++;
        }
             
        }
          System.out.println("zc = "+zeroCount);
        System.out.println("oc = "+oneCount);
        
    }
}
