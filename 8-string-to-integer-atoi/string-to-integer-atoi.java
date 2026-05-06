class Solution {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int n = s.length();
        int i = 0;

      
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) return 0;

      
        int sign = 1;
        char firstChar = s.charAt(i);
        if (firstChar == '+' || firstChar == '-') {
            sign = (firstChar == '-') ? -1 : 1;
            i++;
        }

      
        int result = 0;
        while (i < n) {
            int digit = s.charAt(i) - '0';
            if (digit < 0 || digit > 9) break;

            
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}