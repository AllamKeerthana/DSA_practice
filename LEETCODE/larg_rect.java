class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int area = 0;
        int width = 0;
        int n = heights.length;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int h = 0;
            while (!s.isEmpty() && heights[s.peek()] > heights[i]) {
                h = heights[s.pop()];
                if (s.isEmpty()) {
                    left = -1;
                } else {
                    left = s.peek();
                }
                width = i - left - 1;
                area = Math.max(width * h, area);
            }
            s.push(i);
        }
        while (!s.isEmpty()) {

            int height = heights[s.pop()];

            int left;
            if (s.isEmpty()) {
                left = -1;
            } else {
                left = s.peek();
            }

            int right = n;

             width = right - left - 1;

            area = Math.max(area, height * width);
        }

        return area;
    }
}