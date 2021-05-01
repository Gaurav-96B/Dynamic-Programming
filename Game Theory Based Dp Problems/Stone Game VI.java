class Solution {
    class Pair {
		int v, i;
		Pair(int dd, int ii) {
			v = dd;
			i = ii;
		}
	}
    public int stoneGameVI(int[] a, int[] b) {
        int n = a.length;
		Pair p[] = new Pair[n];
		for (int i = 0; i < n; i++) 
			p[i] = new Pair(a[i] + b[i], i); 
		
        Arrays.sort(p, (x,y) -> y.v - x.v); 
        int av = 0, bv = 0;
		for(int i=0;i<n ;i++){
            if(i%2 == 0){
                av += a[p[i].i];
            }else{
                bv += b[p[i].i];
            }
        }
        if(av>bv)
        {
            return 1;
        }
        else if(av<bv)
        {
          return -1;  
        }
        else
        {
            return 0;
        }
	}
	
}
