class Solution {
    public int stoneGameVII(int[] S) {
        int dp[][]=new int[S.length+1][S.length+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        int sum = 0;
        for(int i=0;i<S.length;i++)
        {
            sum=sum+S[i];
        }
        return solve(S,0,S.length-1,sum,dp);
    }
    
    public int solve(int[] S,int start,int end,int sum,int dp[][]) {
        if(start>=end) 
        {
            return 0;
        }
        
        if(dp[start][end]!=-1) 
        {
            return dp[start][end];
        }
        
        int l=sum-S[start]-solve(S,start + 1,end,sum-S[start],dp);
        int r=sum-S[end]-solve(S,start,end - 1,sum - S[end],dp);
        return dp[start][end]=Math.max(l,r);
    }
}
