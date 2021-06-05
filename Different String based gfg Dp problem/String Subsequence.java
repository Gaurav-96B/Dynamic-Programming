class Solution {
    int countWays(String S1, String S2) { 
        return countWays(S1,S2,0,0);
    }
    int countWays(String s1,String s2,int i,int j)
    {
        if(i==s1.length()&&j!=s2.length())
        {
            return 0;
        }
        if(i!=s1.length()&&j==s2.length())
        {
            return 1;
        }
        if(i==s1.length()&&j==s2.length())
        {
            return 1;
        }
        if(s1.charAt(i)==s2.charAt(j))
        {
          return countWays(s1,s2,i+1,j+1)+countWays(s1,s2,i+1,j);  
        }
        else
        {
          return countWays(s1,s2,i+1,j);
        }
    }
}
