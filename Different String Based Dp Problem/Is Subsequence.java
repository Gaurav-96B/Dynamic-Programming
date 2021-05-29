class Solution {
    public boolean isSubsequence(String s, String t) {
        int m=s.length();
        int n=t.length();
        return isSubsequenceCheck(s,t,m,n);
        
    }
    public boolean isSubsequenceCheck(String s,String t,int m,int n)
    {
        if(m==0&&n==0)
        {
            return true;
        }
        if(m==0&&n!=0)
        {
            return true;
        }
        if(m!=0&&n==0)
        {
            return false;
        }
        if(s.charAt(m-1)==t.charAt(n-1))
        {
            return isSubsequenceCheck(s,t,m-1,n-1);
        }
        return isSubsequenceCheck(s,t,m,n-1);
        
    }
}
