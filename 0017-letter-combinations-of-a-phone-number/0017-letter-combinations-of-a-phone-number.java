class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) return res;
        
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(digits, 0, new StringBuilder(), map, res);
        return res;
    }
    
    private void backtrack(String digits, int idx, StringBuilder curr, String[] map, List<String> res) {
        if (idx == digits.length()) {
            res.add(curr.toString());
            return;
        }
        String letters = map[digits.charAt(idx) - '0'];
        for (char c : letters.toCharArray()) {
            curr.append(c);
            backtrack(digits, idx + 1, curr, map, res);
            curr.deleteCharAt(curr.length() - 1); // backtrack
        }
    }
}