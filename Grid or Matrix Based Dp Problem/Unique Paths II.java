class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][]=new int[obstacleGrid.length+1][obstacleGrid[0].length];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return solve(obstacleGrid,0,0,dp);   
    }
    int solve(int arr[][],int i,int j,int dp[][]){
    if(i<0||j<0||i>=arr.length||j>=arr[i].length||arr[i][j]==1)
    {
        return 0;
    }
    if(i==arr.length-1 && j==arr[i].length-1)
    {
        return 1;
    }
    if(dp[i][j]!=-1)
    {
        return dp[i][j];
    }
     return dp[i][j]=solve(arr,i+1,j,dp)+solve(arr,i,j+1,dp);
 }
    
}
