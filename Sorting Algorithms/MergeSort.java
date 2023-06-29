import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr={5,8,6,4,1};
        arr=mergeS(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // System.out.println(Arrays.toString(arr));
        
    }
    public static int[] mergeS(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int left[]= mergeS(Arrays.copyOfRange(arr, 0, mid));
        int right[]= mergeS(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    
    }
    public static int[]merge(int[] first,int []second) 
    {
        int []mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k++]=first[i++];
        }
        while(j<second.length){
            mix[k++]=second[j++];
        }
        return mix;
    }
    
}
