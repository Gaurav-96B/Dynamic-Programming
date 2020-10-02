class GFG {
	public static void main (String[] args) {
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    sc.nextLine();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        int listable[]=new int[n];
	        listable[0]=1;
	        for(int i=1;i<n;i++)
	        {
	            listable[i]=1;
	            for(int j=i-1;j>=0;j--)
	            {
	                if(a[i]>a[j])
	                {
	                    int possible=listable[j]+1;
	                    if(possible>listable[i])
	                    {
	                        listable[i]=possible;
	                    }
	                }
	            }
	        }
	        int distable[]=new int[n];
	        distable[n-1]=1;
	        for(int i=n-2;i>=0;i--)
	        {
	            distable[i]=1;
	            for(int j=n-1;j>i;j--)
	            {
	                if(a[i]>a[j])
	                {
	                    int possible=distable[j]+1;
	                    if(possible>distable[i])
	                    {
	                        distable[i]=possible;
	                    }
	                }
	            }
	        }
	        int max=listable[0]+distable[0]-1;
	        for(int i=0;i<n;i++)
	        {
	            if(listable[i]+distable[i]-1>max)
	            {
	              max=listable[i]+distable[i]-1;  
	            }
	        }
	        System.out.println(max);
	        
	    }
	}
}
