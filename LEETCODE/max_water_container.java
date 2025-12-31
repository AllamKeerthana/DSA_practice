public class max_water_container {

    public int maxArea(int[] height) {
      int left =0;
      int right = height.length-1;
      int max = 0;
      while(left<=right){
        int area = Math.min(height[right],height[left]) * (right-left);
        max = Math.max(max,area);
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }

      }  
      return max;
    }
}
