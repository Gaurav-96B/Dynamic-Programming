class Solution {
    static int count(String a, String b, int m, int n) 
    { 
        if ((m == 0 && n == 0) || n == 0) 
        {
            return 1; 
        }
        if (m == 0) 
        {
            return 0; 
        }
        if (a.charAt(m - 1) == b.charAt(n - 1))
        {
            return count(a, b, m - 1, n - 1) + count(a, b, m - 1, n); 
        }
        else
        {
            return count(a, b, m - 1, n); 
        }
    } 
    int countWays(String S1, String S2) { 
        return count(S1, S2, S1.length(), S2.length());
        
    }
}
