package array_easy;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int i = maxArea(new int[]{4, 8, 1, 2, 3, 9});
        System.out.println(i);
    }

    public static int maxArea(int[] heights) {
        int p1 = 0;
        int p2 = heights.length - 1;
        int maxArea = 0;

        while (p1 < p2) {
            int height = Math.min(heights[p1], heights[p2]);
            int width = p2 - p1;
            int area = width * height;
            maxArea = Math.max(maxArea, area);

            if (heights[p1] <= heights[p2]) p1++;
            else p2--;
        }

        return maxArea;
    }


    public int maxArea1(int[] height) {
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
