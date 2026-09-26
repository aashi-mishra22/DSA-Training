class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        // Count characters of s
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        // Remove characters using t
        for (char ch : t.toCharArray()) {
            count[ch - 'a']--;
        }

        // Check if all counts are zero
        for (int x : count) {
            if (x != 0) {
                return false;
            }
        }

        return true;
    }
}