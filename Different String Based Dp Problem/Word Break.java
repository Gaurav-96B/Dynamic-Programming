class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String>set=new HashSet<>();
        Boolean dp[]=new Boolean[s.length()+1];
        for(int i=0;i<wordDict.size();i++)
        {
            set.add(wordDict.get(i));
        }
        return wordBreak(s,set,0,dp);   
    }
    public boolean wordBreak(String s,Set<String>set,int i,Boolean dp[])
    {
        if(i==s.length())
        {
            return true;
        }
        if(dp[i]!=null)
        {
            return dp[i];
        }
        for(int j=i+1;j<=s.length();j++)
        {
            String sub=s.substring(i, j);
            if (set.contains(sub) && wordBreak(s,set,j,dp)) 
            {
                return dp[i]=true;
            }
        }
        return dp[i]=false;
    }
}
