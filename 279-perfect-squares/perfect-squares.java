class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=i;
            for(int j=2;j*j<=i;j++)
            {
                dp[i]=Math.min(dp[i],1+(dp[i-(j*j)]));
            }
        }
        // System.out.print(Arrays.toString(dp));
        return dp[n];
    }
}