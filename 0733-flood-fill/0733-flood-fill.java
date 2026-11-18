class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         int originalColor = image[sr][sc];

        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    public void dfs(int[][] image, int sr, int sc,
                    int originalColor, int color) {

        // Boundary and color check
        if (sr < 0 || sc < 0 ||
            sr >= image.length ||
            sc >= image[0].length ||
            image[sr][sc] != originalColor) {
            return;
        }

        // Change current pixel
        image[sr][sc] = color;

        // Visit all four directions
        dfs(image, sr + 1, sc, originalColor, color);
        dfs(image, sr - 1, sc, originalColor, color);
        dfs(image, sr, sc + 1, originalColor, color);
        dfs(image, sr, sc - 1, originalColor, color);
    }
}