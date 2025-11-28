public class universal_rotat {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 6;   // +ve = left rotate, -ve = right rotate

        int n = arr.length;
        int[] rot_arr = new int[n];

        k = k % n;         // reduce k
        if (k < 0) {
            k = k + n; // when k is neg right rotation
            }

        // Step 2: Universal rotation formula
        for (int i = 0; i < n; i++) {
            rot_arr[(i - k + n) % n] = arr[i];
        }

        // Step 3: Print rotated array
        for (int x : rot_arr) {
            System.out.print(x + " ");
        }
    }
}

}
