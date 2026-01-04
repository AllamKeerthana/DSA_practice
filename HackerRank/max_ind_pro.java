import java.util.List;

public class max_ind_pro {

    public static int solve(List<Integer> arr) {
        int n = arr.size();
        long maxProduct = 0;

        for (int i = 0; i < n; i++) {

            long left = 0;
            long right = 0;

            // Search nearest greater on LEFT
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j) > arr.get(i)) {
                    left = j + 1;   // convert to 1-based index
                    break;
                }
            }

            // Search nearest greater on RIGHT
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) > arr.get(i)) {
                    right = j + 1;  // convert to 1-based index
                    break;
                }
            }

            maxProduct = Math.max(maxProduct, left * right);
        }

        return (int) maxProduct;
    }
}
