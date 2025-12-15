class longest_substr_chr {
    public static void main(String[] args) {
        String s = "abcdaaabbbdfffff";
        String longest = "";
        String current = "" + s.charAt(0); // start with first character

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                current += s.charAt(i);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + s.charAt(i);
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println(longest);
    }
}
