class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    int maxSumLis[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	      maxSumLis[i]=arr[i];  
	    }
	    return maxSum(arr,maxSumLis);
	}
	public int maxSum(int arr[],int maxSumLis[])
	{
	    for(int i=1;i<arr.length;i++)
	    {
	        for(int j=i-1;j>=0;j--)
	        {
	            if(arr[i]>arr[j])
	            {
	                maxSumLis[i]=Math.max(maxSumLis[i],maxSumLis[j]+arr[i]);
	            }
	        }
	    }
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<arr.length;i++)
	    {
	        max=Math.max(max,maxSumLis[i]);
	    }
	    return max;
	}
}
