public class find_median {
    public static int findMedian(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        int n = arr.size();
        return arr.get(n/2);
    }

}
