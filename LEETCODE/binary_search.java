public class binary_search {

    public int search(int[] nums, int target) {
        int ans = -1;
        int low =0, high=nums.length-1,mid=0;
        if(low==high){
            if(nums[low]==target) return low;
        }
        while(low<=high){
            mid = low+(high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                return ans;
            }

            if(nums[mid]>target){
                high = mid-1;
            }

            if(nums[mid]<target){
                low=mid+1;
            }


        }

        return ans;
    }
}

