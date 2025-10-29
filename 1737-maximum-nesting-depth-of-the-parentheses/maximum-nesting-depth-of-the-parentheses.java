class Solution {
    public int maxDepth(String s) {
        int maxdepth=0;
        int depth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
            depth++;
            maxdepth=Math.max(maxdepth,depth);
        }
        else if(c==')'){
        depth--;
        }
    }
    return maxdepth;
    }
}