class Solution {
    public boolean increasingTriplet(int[] nums) {
        int lis[]=new int[nums.length];
        Arrays.fill(lis,1);
        return lis(nums,lis);   
    }
    public boolean lis(int nums[],int lis[])
    {
        for(int i=1;i<nums.length; i++) {
            for(int j=i-1;j>=0;j--) {
                if(nums[i]>nums[j])
                    lis[i] = Math.max(lis[i],lis[j]+1);
            }
        }
        for(int i=0;i<lis.length;i++)
        {
            if(lis[i]==3)
            {
                return true;
            }
        }
        return false;
    }   
}
