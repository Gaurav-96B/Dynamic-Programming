class Solution {
    public int findNumberOfLIS(int[] nums) {
        int lis[]=new int[nums.length];
        int lisCount[]=new int[nums.length];
        Arrays.fill(lis,1);
        Arrays.fill(lisCount,1);
        int max=lis(nums,lis,lisCount); 
        int count=0;
        for(int i=0;i<lis.length;i++)
        {
            if(lis[i]==max)
            {
                count=count+lisCount[i];
            }
        }
        return count;
    } 
    public int lis(int nums[],int lis[],int lisCount[])
    {
        for(int i=1;i<nums.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(nums[i]>nums[j])
                {
                int possibleAns=lis[j]+1;
                if(possibleAns>lis[i])
                {
                    lis[i]=possibleAns;
                    lisCount[i]=lisCount[j];
                }
                else if(possibleAns==lis[i])
                {
                   lisCount[i]=lisCount[i]+lisCount[j];
                }
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
