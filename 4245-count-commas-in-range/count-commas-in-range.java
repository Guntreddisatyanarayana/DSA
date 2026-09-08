class Solution {
    public int countCommas(int n) {
        int k=0;
        if(n<1000)
        {
            k=0;
        }
        else if(n>=1000)
        {
            k=(n-1000)+1;
            
        }
        return k;
    }
}