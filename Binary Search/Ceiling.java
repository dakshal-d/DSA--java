public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target= 6;
        int ans= binaryCeiling(arr, target);
        System.out.println("the Ceiling of the target element is: "+ ans);        
    }
    //return index of the smallest number greater than the target
    static int binaryCeiling(int arr[], int target){

        int start=0;
        int end=arr.length-1;
        if(target> arr[arr.length-1]){
            return -1;
        }
        while(start<=end){

            // int mid= (start+end)/2;
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
    
}
  