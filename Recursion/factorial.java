// package Recursion;

import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
        
    }
    static int fact(int n){
        if (n==0 || n == 1 ){
            return 1 ;
        }else{
            return n*fact(n-1);
        }
    }  
}
