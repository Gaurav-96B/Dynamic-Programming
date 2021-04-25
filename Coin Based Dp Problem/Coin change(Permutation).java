class Main
{
    public static int count(int[] S, int N)
    {
        if (N == 0) {
            return 1;
        }
        if (N < 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < S.length; i++)
        {
           
            result += count(S, N - S[i]);
        }
        return result;
    }
 
    public static void main(String[] args)
    {
        int[] S = { 1, 2, 3 };
        int N = 4;
        System.out.println("The total number of ways to get the desired change is "
                + count(S, N));
    }
}
