public class del_char_fancy {

    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            // allow only first 2 occurrences
            if (count <= 2) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}

