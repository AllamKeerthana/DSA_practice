class max_words_type {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> broken = new HashSet<>();
        for(char ch : brokenLetters.toCharArray()){
            broken.add(ch);
        }
        String[] words = text.split(" ");
        int count = 0;
        for(String word : words){
            boolean seen = true;
            for(char ch : word.toCharArray()){
                if(broken.contains(ch)){
                    seen = false;
                    break;
                }
            }
            if(seen) count++;
        }
        return count;
    }
}