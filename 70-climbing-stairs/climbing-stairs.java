class Solution {
    public int climbStairs(int n) {
        int m=1;int k=1;
        for(int i=1;i<n;i++){
            int temp=m;
            m=m+k;
            k=temp;
        }
        return m;
    }
}