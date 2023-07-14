// package Recursion;


public class NoofZeroes
{
	public static void main(String[] args) {
		int num= 690069006;
		System.out.println(zeroes(num));
		
	}
	public static int zeroes(int num){
	    int count=0;
	    
	    while(num!=0){
	        int n=num%10;
	        if(n==0){
	            count++;
	            
	        }
	        num=num/10;
	    }
	    return count;
	}
}
