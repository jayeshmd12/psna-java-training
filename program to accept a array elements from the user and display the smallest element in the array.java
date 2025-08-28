import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int smallest = a[0];
        for(int i=0;i<size;i++){
            if(a[i]<smallest){
                smallest = a[i];
            }
        }
        System.out.println(smallest);
    }
}
