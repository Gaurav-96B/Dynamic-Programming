class Solution {
    public int minSteps(int n) {
	int res = 0;
	if (n == 1) 
    {
        return res;  
    }
	int sqrtMid = (int) Math.sqrt(n);
	for (int i = 2; i <= sqrtMid; i++) 
    {
		if (n % i == 0) 
        { 
			res=res+(i + minSteps(n / i)); 
			return res;
		}
	}
	return n; 
}
}
