class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] present = new boolean[1001];
        int[] temp = new int[1001];
        int k = 0;

        // Store elements of nums1
        for (int num : nums1) {
            present[num] = true;
        }

        // Check elements of nums2
        for (int num : nums2) {
            if (present[num]) {
                temp[k] = num;
                k++;

                // Avoid duplicates
                present[num] = false;
            }
        }

        // Create result array of exact size
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}