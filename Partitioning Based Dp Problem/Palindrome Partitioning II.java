class Solution {
    public int minCut(String s) 
    {
        int dp[][]=new int[s.length()][s.length()];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return helper(s, 0, s.length() - 1,dp);
    }
    
    public int  helper(String s, int start, int end,int dp[][]) 
    {
        if (start == end || isPalindrome(s, start, end)) 
        {
            return 0;
        }
        if (dp[start][end]!=-1) 
        {
            return dp[start][end];
        }
        int cut=s.length() - 1;
        for (int i=start; i<=end; i++) 
        {
            if (isPalindrome(s, start, i)) 
            {
                cut = Math.min(cut,helper(s, i + 1, end,dp)+1);
            }
        }
        dp[start][end] = cut;
        return cut;
    }
    
    public boolean isPalindrome(String s, int left, int right) 
    {
        while (left < right) 
        {
            if (s.charAt(left++) != s.charAt(right --))
            {
                return false;
            }
        }
        return true;
    }
}
