class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        int dp[][]=new int[multipliers.length+1][multipliers.length+1];
        for(int row[]:dp)
        {
        Arrays.fill(row,-1);
        }
        return maxScore(nums,multipliers,0,0,nums.length-1,dp);   
    }
    public int maxScore(int nums[],int mulitipliers[],int curr,int start,int end,int dp[][])
    {
        if(curr==mulitipliers.length)
        {
            return 0;
        }
        if(dp[start][curr]!=-1)
        {
            return dp[start][curr];
        }
int one=nums[start]*mulitipliers[curr]+maxScore(nums,mulitipliers,curr+1,start+1,end,dp);
int two=nums[end]*mulitipliers[curr]+maxScore(nums,mulitipliers,curr+1,start,end-1,dp);
return dp[start][curr]=Math.max(one,two);  
    }
}
