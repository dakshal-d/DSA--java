import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();  
        int[] heights = new int[n]; 
        for(int j=0; j<n; j++){ 
            heights[j]=sc.nextInt();  
        } 
        // int[] heights = {2, 1, 6, 6, 1, 5};
        int largestArea = largestRectangleArea(heights);
        System.out.println(largestArea);
    }
    public static int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int len = heights.length;
        stack.push(heights[0]);
        int result = 0;
        int count = 0;
        for(int i = 1; i < len; i++){
            int add = heights[i];
            if(add >= stack.peek())
                stack.push(heights[i]);
            else{
                count = 0;
                while(!stack.isEmpty() && stack.peek() > add){
                    count++;
                    int val = stack.pop();
                    result = Math.max(result, val * count);
                }
                while(count != 0){
                    count--;
                    stack.push(add);
                }
                stack.push(add);
            }
        }
        count = 1;
        while(!stack.isEmpty()){
            int last = stack.pop();
            result = Math.max(result, last * count++);
        }
        return result;
    }
}





// import java.util.Scanner;

// class MaximumSubarray {

//   private static int findMaxSubarraySum(int[] nums) {
//     int n = nums.length;
//     int maxSoFar = nums[0];
//     int maxEndingHere = nums[0];

//     for(int i = 1; i < n; i++) {
//       if(maxEndingHere + nums[i] < nums[i]) {
//         maxEndingHere = nums[i];
//       } else {
//         maxEndingHere = maxEndingHere + nums[i];
//       }

//       if(maxEndingHere > maxSoFar) {
//         maxSoFar = maxEndingHere;
//       }
//     }
//     return maxSoFar;
//   }

//   public static void main(String[] args) {
//     Scanner keyboard = new Scanner(System.in);
//     int n = keyboard.nextInt();
//     int[] nums = new int[n];
//     for(int i = 0; i < n; i++) {
//       nums[i] = keyboard.nextInt();
//     }

//     System.out.println(findMaxSubarraySum(nums));
//   }
// }