import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of elements:");
        int n = sc.nextInt();
        
        int[] nums= new int[n]; 

        System.out.println("Enter array:");
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        nums[i]=sc.nextInt();  
        } 
        System.out.println("Elemment to be searched:");
        
        int target= sc.nextInt();
        int ans=LinearS(nums, target);
        System.out.println(ans);
        
    }
    static int LinearS(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }
    
    for (int i=0;i<arr.length;i++){
        int element=arr[i];
        if(element==target){
            return i;
        }
        
    }
    return -1;
}
}
