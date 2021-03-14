class Solution
{
    static int breakSum(int n) 
    { 
        if (n==0 || n == 1) 
            return n; 
        return Math.max((breakSum(n/2) + breakSum(n/3) + 
                    breakSum(n/4)),  n);     
    } 
    public int maxSum(int n) 
    { 
        return breakSum(n); 
    } 
}
