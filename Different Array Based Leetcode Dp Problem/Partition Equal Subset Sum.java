
class Solution {
    public boolean canPartition(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        if(sum%2!=0)
        {
            return false;
        }
       Boolean[][] dp=new Boolean[arr.length+1][sum/2];
       return canBePartitioned(arr,0,0,sum/2,arr.length,dp);
    }
     boolean canBePartitioned(int[] arr,int start,int sum,int targetSum, int n,Boolean[][] dp){
        if(start>=n)
        {
            return false;
        }
        
        if(targetSum==sum)
        {
            return true;
        }
        if(targetSum<sum)
        {
            return false;
        }

        if(dp[start][sum]!=null)
        {
            return dp[start][sum];
        }
        boolean found=canBePartitioned(arr,start+1,sum+arr[start],targetSum,n,dp)
                                                ||
                            canBePartitioned(arr,start+1,sum,targetSum,n,dp);
        return dp[start][sum]=found;
    }
}
