public class SearchinRange {
    public static void main(String[] args) {
        int[] arr={18,52,45,-8,25,7};
        int target=25;
        System.out.println(LinearS(arr, target, 1,4));

        
    }
    static int LinearS(int[] arr,int target, int start, int end){
        if (arr.length==0){
            return -1;
        }
    
    for (int i=start;i<end;i++){
        int element=arr[i];
        if(element==target){
            return i;
        }
        
    }
    return -1;
}

    
}
