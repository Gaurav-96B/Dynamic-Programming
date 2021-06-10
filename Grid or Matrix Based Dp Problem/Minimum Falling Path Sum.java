class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int dp[][]=new int[matrix.length][matrix.length+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        int ans=Integer.MAX_VALUE;
        int currSum=0;
        for(int i=0;i<matrix[0].length;i++)
        {
            currSum=rectangle(matrix,0,i,dp);
            ans=Math.min(ans,currSum);
        }  
        return ans;
    }
    public int rectangle(int matrix[][],int i,int j,int dp[][])
    {
        if(i<0||i>=matrix.length)
        {
            return 0;
        }
        if(j<0||j>=matrix[0].length)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int option1=rectangle(matrix,i+1,j-1,dp);
        int option2=rectangle(matrix,i+1,j,dp);
        int option3=rectangle(matrix,i+1,j+1,dp);
        return dp[i][j]=matrix[i][j]+Math.min(option1,Math.min(option2,option3));
    }
}
