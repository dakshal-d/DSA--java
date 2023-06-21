import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubblest(arr);
        System.out.print(Arrays.toString(arr));
        
    }
    static void bubblest(int[] arr){
        boolean swap;
        for(int i=0; i<arr.length;i++){
            swap=false;
            for(int j=1;j<arr.length-i;j++){
                if (arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }

            }
            if(!swap){
                break;
            }
        }
    
    }
    
}

// Space complexity= O(1)   (as no new space is created)
// Time Complexity =O(n^2)--Worst Case  as we are iterating through the array
// Time Complexity =O(n)--Best Case 
