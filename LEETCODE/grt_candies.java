class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int arr : candies){
            if(max<arr) max = arr;
        }
        List<Boolean> ans = new ArrayList<>();
        
        for(int arr : candies){
            if(arr+extraCandies>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}