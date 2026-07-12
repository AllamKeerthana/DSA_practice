class Solution {
    public int[] arrayRankTransform(int[] arr) {

        if(arr.length == 0)
            return new int[0];

        int[] copy = arr.clone();
        Arrays.sort(copy);

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(copy[0], 1);

        for(int i = 1; i < copy.length; i++) {
            if(copy[i] == copy[i-1]) {
                map.put(copy[i], map.get(copy[i-1]));
            } else {
                map.put(copy[i], map.get(copy[i-1]) + 1);
            }
        }

        int[] ans = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}