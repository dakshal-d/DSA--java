import java.util.*;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        bubblest(arr);
        for(int z=0;z<arr.length;z++){
            System.out.print(arr[z]+" ");
        }
    }

    static void bubblest(int[] arr){
        // boolean swap;
        for(int i=0; i<arr.length;i++){
            // swap=false;
            for(int j=1;j<arr.length-i;j++){
                if (arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    // swap=true;
                }

            }
            // if(!swap){
            //     break;
            // }
        }
    
    }
    
}

// Space complexity= O(1)   (as no new space is created)
// Time Complexity =O(n^2)--Worst Case  as we are iterating through the array
// Time Complexity =O(n)--Best Case 
