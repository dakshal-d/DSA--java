public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target= 10;
        int ans= binaryS(arr, target);
        System.out.println("the position of the target element is: "+ans);
        
    }
    //return index
    static int binaryS(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){

            // int mid= (start+end)/2;
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }
            if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
  