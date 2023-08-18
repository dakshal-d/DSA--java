package Questions;

import java.util.*;
public class BatteryLaptop
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		laptop(arr,n);
	}
	public static void laptop(int arr[],int n){
	    int count=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]>0){
	            count++;
	        }
	        for(int j=0;j<n;j++){
	            arr[j]=arr[j]-1;
	        }
	    }
	    System.out.print(count);
	}
}