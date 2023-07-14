// package Recursion;
import java.math.BigInteger;
import java.util.*;

public class ques {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        // int ans=fact(a)/fact(b)*fact(a-b)%m;
        // System.out.println(ans);

        BigInteger ans = fact(a).divide(fact(b).multiply(fact(a - b))).mod(BigInteger.valueOf(m));
        System.out.println(ans);
       
    }
    static BigInteger fact(int x) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= x; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
    
}
