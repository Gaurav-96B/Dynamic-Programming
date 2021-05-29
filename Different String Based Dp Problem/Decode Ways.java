class Solution
{
public int numDecodings(String s) 
{
	int dp[]= new int[s.length() + 1];
    Arrays.fill(dp,-1);
	return numDecodings(s, 0,dp);
}

public int numDecodings(String s, int index,int dp[]) {
	if (index == s.length())
    {
		return 1;
	}
	if (s.charAt(index)=='0')
    {
		return 0;
	}
	if (dp[index]!=-1) 
    {
		return dp[index];
	}
	int way1 = numDecodings(s, index + 1,dp);
	int way2 = 0;
	if (index < s.length() - 1 && Integer.parseInt(s.substring(index, index + 2)) <= 26) 
    {
		way2 = numDecodings(s, index + 2,dp);
	}
	dp[index]=way1 + way2;
	return dp[index];
}
}
