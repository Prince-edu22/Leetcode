class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int [len1+1][len2+1];
        for(int i=1;i<=len2;++i){
            dp[0][i]=i;
        }
        for(int j=1;j<=len1;++j){
            dp[j][0]=j;
            for(int i=1;i<=len2;++i){
                if(word1.charAt(j-1)==word2.charAt(i-1)){
                    dp[j][i]=dp[j-1][i-1];
                }
                else{
                    int insert = dp[j][i-1];
                    int delete = dp[j-1][i];
                    int replace = dp[j-1][i-1];
                    dp[j][i] = Math.min(insert,Math.min(delete,replace))+1;
                }
            }
        }
        return dp[len1][len2];
    }
}