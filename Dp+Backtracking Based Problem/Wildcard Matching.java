class Solution {
     public boolean isMatch(String s, String p)
    {
        Boolean dp[][]=new Boolean [s.length()][p.length()];
        return wm(s,p,0,0,dp);   
    }
    public boolean wm(String s,String p,int i,int j,Boolean dp[][])
    {
       if(i==s.length()&&j==p.length()) // 1st Condition
       {
           return true;
       }
        
        if(j==p.length()&&i!=s.length()) // 2nd condition
        {
            return false;
        }
        
        if(i==s.length()) //3rd condition
        {
            for(int index=j;index<p.length();index++)
            {
                if(p.charAt(index)!='*')
                {
                    return false;
                }
            }
            return true;
        }
        
       if(dp[i][j]!=null)
       {
           return dp[i][j];
       }
        
    boolean ans=false;
    if(p.charAt(j)=='?') //4th condition
    {
        if(wm(s,p,i+1,j+1,dp))
        {
            ans=true;
        }
    }
        
    else if(p.charAt(j)=='*') //5th condition
    {
      if(wm(s,p,i,j+1,dp))
        {
            ans=true;
        }
        if(wm(s,p,i+1,j+1,dp))
        {
            ans=true;
        }
        if(wm(s,p,i+1,j,dp))
        {
            ans=true;
        }
    }
        
    else //6th condition
    {
        if(s.charAt(i)==p.charAt(j)&&wm(s,p,i+1,j+1,dp))
        {
            ans=true;
        }
    }
    return dp[i][j]= ans;
}
}
