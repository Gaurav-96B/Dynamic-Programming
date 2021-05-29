/*TC=>O(n^2)
SC=>O(1)*/

class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            count=count+countPalindromesAroundCenter(s, i, i);
            count=count+countPalindromesAroundCenter(s, i, i + 1);
        } 
        return count;
    }
    public int  countPalindromesAroundCenter(String s, int l, int r){
        int count = 0;
        while(l >= 0 && r < s.length())
        {
            if(s.charAt(l--) != s.charAt(r++)) 
            {
                return count;
            } 
            count++;
        }
        return count;
    }
}
