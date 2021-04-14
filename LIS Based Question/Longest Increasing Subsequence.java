class Solution {
    public int lengthOfLIS(int[] nums) {
        int lis[]=new int[nums.length];
        Arrays.fill(lis,1);
        return LIS(nums,lis);   
    }
    public int LIS(int nums[],int lis[])
    {
       for(int i=1;i<nums.length;i++) 
       {
           for(int j=i-1;j>=0;j--)
           {
               if(nums[i]>nums[j])
               {
                   lis[i]=Math.max(lis[i],lis[j]+1);
               }
           }
       }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<lis.length;i++)
        {
            max=Math.max(max,lis[i]);
        }
        return max;
    }
    
}
