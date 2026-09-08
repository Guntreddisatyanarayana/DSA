class Solution {
    public int countCommas(int n) {
        int k=0;
        if(n<1000)
        {
            k=0;
        }
        else if(n>=1000)
        {
            for(int i=1000;i<=n;i++)
                {
                    k++;
                }
            
        }
        return k;
    }
}