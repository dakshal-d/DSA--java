import java.util.Arrays;

public class BSusingRecursion {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        BS(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        
    }
    public static void BS(int[] arr,int c,int r ){
        if (c<0 ||r<=0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            BS(arr,c+1,r);
        }else{
            BS(arr,0,r-1);
        }
    }
    
}
