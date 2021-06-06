/*TC=>O(n^2)
SC=>O(1)*/
class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) 
        {
            String odd = getPalindrome(s, i, i);
            String even = getPalindrome(s, i, i + 1);
            if (longest.length() < odd.length())
            {
                longest = odd;
            }
            if (longest.length() < even.length())
            {
                longest = even;
            }
        }
        return longest;
    }
    
    private String getPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) 
        {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
