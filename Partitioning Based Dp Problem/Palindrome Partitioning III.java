class Solution {
    public int palindromePartition(String s, int k) {
        int dp[][]=new int[k+1][s.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return findMin(s, k, 0,dp);
    }
    public int findMin(String s, int k, int l,int dp[][]){
        if(k==0 && l<s.length()) 
        {
            return s.length();
        }
        if(k>s.length()-l) 
        {
            return s.length();
        }
        if(k==0)
        {
            return 0;
        }
        if(dp[k][l]!=-1)
        {
            return dp[k][l];
        }
        int min = s.length();
        for(int i=l; i<s.length()-k+1; i++)
        {
            min = Math.min(min, cost(s, l, i) + findMin(s, k-1, i+1,dp));
        }
        dp[k][l]=min;
        return dp[k][l];
    }
    
    private int cost(String s, int l, int r){
        int c = 0;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))
            {
                c++;
            }
            l++; r--;
        }
        return c;
    }
}
