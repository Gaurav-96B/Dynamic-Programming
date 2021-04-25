class Solution {
    static Long countWays(int N) {
    long dp[]=new long[N+1];
       int sum=0;
        Arrays.fill(dp,-1);
        return countWay(N,dp,sum);
    }
    static long countWay(int n,long dp[],int sum)
    {
        if(sum==n)
        {
            return 1;
        }
        if(sum>n)
        {
            return 0;
        }
        if(dp[sum]!=-1)
        {
            return dp[sum]%1000000007;
        }
        return dp[sum]=(countWay(n,dp,sum+1)+countWay(n,dp,sum+3)+countWay(n,dp,sum+4))%1000000007;
    }

    
};
