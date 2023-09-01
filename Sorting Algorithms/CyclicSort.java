import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={2,5,4,3,1};
        cycle(arr);
        System.out.print(Arrays.toString(arr));
        
    }
    public static void cycle(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct= arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
    }
}
