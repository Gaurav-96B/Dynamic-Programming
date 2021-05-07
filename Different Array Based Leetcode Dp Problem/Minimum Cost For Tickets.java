class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[]=new int[days.length+1];
        Arrays.fill(dp,-1);
        return minCost(days,costs,0,dp);  
    }
    public int minCost(int days[],int costs[],int i,int dp[])
    {
        if(i>=days.length)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int option1=costs[0]+minCost(days,costs,i+1,dp);
        
        int k=i;
        for(;k<days.length;k++)
        {
            if(days[k]>=days[i]+7)
            {
                break;
            }
        }
        int option2=costs[1]+minCost(days,costs,k,dp);
        
        for(k=i;k<days.length;k++)
        {
           if(days[k]>=days[i]+30)
            {
                break;
            }  
        }
        int option3=costs[2]+minCost(days,costs,k,dp);
        return dp[i]= Math.min(option1,Math.min(option2,option3));
    }
}
