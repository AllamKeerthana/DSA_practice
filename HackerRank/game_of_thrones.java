public static String gameOfThrones(String s) {
        int n = s.length();
        int[] freq = new int[26];

        // Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int oddCount = 0;

        for (int a : freq) {
            if (a % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount <= 1) {
            return "YES";
        } else {
            return "NO";
        }
    }