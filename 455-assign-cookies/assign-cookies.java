class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n =g.length;
        int m =s.length;
        int count=0,i=0,j=0;
        while(i < n && j<m){
            if(g[i]<=s[j]){
            count++;
            i++;
        }
        j++;
    }
     return count;
    }
}