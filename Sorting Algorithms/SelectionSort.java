import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        SelectionSt(arr);
        System.out.print(Arrays.toString(arr));
        
    }

    static void SelectionSt(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxx=maxed(arr, 0, last);
            swap(arr, maxx, last);

        }
    }
    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int maxed(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(max<arr[i]){
                max=i;
            }
        }
        return max;
    }
    
}
