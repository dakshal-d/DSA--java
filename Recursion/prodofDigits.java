// package Recursion;

import java.util.Scanner;

public class prodofDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(prod(n));
    }
    static int prod(int n){
        if(n%10==n){
            return n;
        }else{
            return (n%10)*prod(n/10);
        }
    }
}
