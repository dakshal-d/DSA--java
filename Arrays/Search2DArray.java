public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {1,5,4},
            {5,8,5,4},
            {4,8,7,6}
        };
        int target= 3 ;
        System.out.println(search(arr, target));



    }
    static boolean search(int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]== target){
                    return true;
                }
            }
        }
        return false;
    }
    
}
