class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];

        // Step 1: Count frequency of each character
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        // Step 2: Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {

            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // No unique character found
        return -1;

    }
}