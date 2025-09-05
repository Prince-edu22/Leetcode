class Solution {
    public int strStr(String haystack, String needle) {
        int str1=haystack.length();
        int str2=needle.length();
        for (int i = 0; i < str1 - str2 + 1; ++i)
        if (haystack.substring(i, i + str2).equals(needle))
        return i;

    return -1;
  }
}