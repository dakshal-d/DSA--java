import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={2,4,3,7,5,6};
        arr=sort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static int[] sort(int []arr){
        if(arr.length==1) return arr;
        int mid=arr.length/2;
        int[] left=sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
        
    }
    private static int[] merge(int[] left, int[] right) {
        int mix[]=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        //either of the while loop will run below, if there are odd number of elements in the array and left and right array 
        //do not have same elements 
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
