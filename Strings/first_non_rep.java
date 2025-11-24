package Strings;

public class first_non_rep {
     public static void main(String[] args) {
        String s = "aabbeddc";
        System.out.println(firstNonRepeat(s));
    }

    public static char firstNonRepeat(String s) {
        int[] freq = new int[26];

        // count freq
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // find the first with freq = 1
        for (char ch : s.toCharArray()) {
            if (freq[ch - 'a'] == 1) {
                return ch;
            }
        }

        return '#'; // no non-repeating char
    }
}


