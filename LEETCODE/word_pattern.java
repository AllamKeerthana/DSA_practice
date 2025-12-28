public class word_pattern {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        Map<Character, String> chartoword = new HashMap<>();
        Map<String, Character> wordtochar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (chartoword.containsKey(ch)) {
                if (!chartoword.get(ch).equals(word)) {
                    return false;
                }
            } else {
                chartoword.put(ch, word);   
            }

            if (wordtochar.containsKey(word)) {
                if (wordtochar.get(word) != ch) {
                    return false;
                }
            } else {
                wordtochar.put(word, ch);  
            }
        }

        return true;
    }
}

