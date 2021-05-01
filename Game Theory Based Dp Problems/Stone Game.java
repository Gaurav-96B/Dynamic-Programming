class Solution {
    public boolean stoneGame(int[] piles) {
        int dp[][]=new int[piles.length+1][piles.length+1];
        for(int row[]:dp)
        Arrays.fill(row,-1);
        int first=maxCount(piles,0,piles.length-1,dp);
        int second=0;
        for(int i=0;i<piles.length;i++)
        {
            second=second+piles[i];
        }
        return first>second-first;
    }
    public int maxCount(int piles[],int i,int j,int dp[][])
    {
        if(i>=piles.length||j<0)
        {
            return 0;
        }
        if(i+1==j)
        {
            Math.max(piles[i],piles[j]);
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int start=piles[i]+Math.min(maxCount(piles,i+2,j,dp),maxCount(piles,i+1,j-1,dp));
        int end=piles[j]+Math.min(maxCount(piles,i,j-2,dp),maxCount(piles,i+1,j-1,dp));
        return dp[i][j]=Math.max(start,end);
    }
   
    
}
