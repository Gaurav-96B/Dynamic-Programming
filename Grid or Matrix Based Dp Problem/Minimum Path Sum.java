
class Solution 
{
    public int minPathSum(int[][] grid) 
    {
        int dp[][]=new int[grid.length+1][grid[0].length+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return find(grid,0,0,dp);
		}
    public int find(int grid[][],int i,int j,int dp[][])
    {
        if(i==grid.length-1&&j==grid[i].length-1)
        {
            return grid[i][j];
        }
        if(i>=grid.length||j>=grid[i].length)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
    return dp[i][j]=grid[i][j]+Math.min(find(grid,i+1,j,dp),find(grid,i,j+1,dp));
         
   }
}
