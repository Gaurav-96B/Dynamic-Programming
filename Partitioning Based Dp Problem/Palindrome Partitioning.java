class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>curr=new ArrayList<>();
        partion(s,ans,curr,0);
        return ans;
           
    }
    public void partion(String s,List<List<String>>ans,List<String>curr,int startIndex)
    {
        if(startIndex==s.length())
        {
            ans.add(new ArrayList<>(curr));
        }
        for(int i=startIndex;i<s.length();i++)
        {
            if(isPallindrom(s,startIndex,i))
            {
                curr.add(s.substring(startIndex,i+1));
                partion(s,ans,curr,i+1);
                curr.remove(curr.size()-1);
                
            }
        }
    }
    public boolean isPallindrom(String s,int low,int high)
    {
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
            {
                return false;
            }
            else
            {
            low++;
            high--;
            }
        }
        return true;
    }
}
