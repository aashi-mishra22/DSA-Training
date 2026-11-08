class Solution {
    public int findNthDigit(int n) {
         long len = 1, count = 9, start = 1;
        
        while (n > len * count) {
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }
        
        long num = start + (n - 1) / len;
        
        int digitIndex = (int)((n - 1) % len);
        return String.valueOf(num).charAt(digitIndex) - '0';
    }
}