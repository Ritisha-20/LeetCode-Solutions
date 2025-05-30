class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        int count = -1;
        if (len == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - len; i++) {
            if (haystack.substring(i, i + len).equals(needle)) {
                count = i;
                break;
            }
        }

        return count;
    }
}