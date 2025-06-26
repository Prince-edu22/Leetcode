class Solution {
    public int fib(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        return fibMemo(n, memo);
    }

    private int fibMemo(int n, int[] memo) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (memo[n] != -1) return memo[n];  
        memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        return memo[n];
    }
}