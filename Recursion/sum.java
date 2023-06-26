package Recursion;

import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(sum1(n));
        
    }
    static int sum1(int n){
        if (n==0 || n == 1 ){
            return n ;
        }else{
            return n+sum1(n-1);
    }
    
}
}
