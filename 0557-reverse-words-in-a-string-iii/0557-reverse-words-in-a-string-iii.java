class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            
            String word = words[i];
            
            // Reverse each word
            for (int j = word.length() - 1; j >= 0; j--) {
                result.append(word.charAt(j));
            }

            // Add space between words
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
        
    }
}