public class Solution {
static int solve(int ind,int[] heights,int[] dp){
    if(ind==0) return 0;
    if(dp[ind]!=-1) return dp[ind];
    int jumpTwo = Integer.MAX_VALUE;
    int jumpOne= solve(ind-1, heights,dp)+ Math.abs(height[ind]-height[ind-1]);
    if(ind>1)
        jumpTwo = solve(ind-2, heights,dp)+ Math.abs(height[ind]-height[ind-2]);
    
	return dp[ind]=Math.min(jumpOne, jumpTwo);
    }
    public static int frogJump(int n, int heights[]) {
        int dp=new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        return solve(n-1,heights,dp);

        // Write your code here..
    }

}