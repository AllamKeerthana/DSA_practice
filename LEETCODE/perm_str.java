class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] need = new int[26];
        int[] freq = new int[26];

        for (char ch : s1.toCharArray()) {
            need[ch - 'a']++;
        }

        int l = 0;

        int len = s1.length();
        for (int r = 0; r < s2.length(); r++) {
            char ch = s2.charAt(r);
            freq[ch - 'a']++;
            if (r - l + 1 == len) {
                if (same(need, freq))
                    return true;
                char left = s2.charAt(l);
                freq[left - 'a']--;
                l++;
                
            }

        }
        return false;
    }

    boolean same(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
