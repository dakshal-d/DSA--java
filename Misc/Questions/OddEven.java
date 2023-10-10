// Small Large Sum
// Q.1 Write a function SmallLargeSum(array) which accepts the array as an argument or parameter, that performs the addition of the second 
// largest element from the even location with the second largest element from an odd location?

// Rules:

// All the array elements are unique.
// If the length of the array is 3 or less than 3, then return 0.
// If Array is empty then return zero.
// Sample Test Case 1:

// Input:

// 6

// 3 2 1 7 5 4

// Output:

// 7

import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(SmallLargeSum(arr,n));
        
    }
    public static int  SmallLargeSum(int arr[],int n){
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        if(arr.length<=3){
            return 0;
        }
        for(int i=0;i<n;i+=2){
            even.add(arr[i]);           
        }
        for (int i = 1; i < arr.length; i+=2) {
            odd.add(arr[i]);            
        }
        Collections.sort(even);
        Collections.sort(odd);
        int ans= even.get(1)+odd.get(1);
        return ans;
    }
    
}
