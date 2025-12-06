public class valid_word {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {

            // invalid characters
            if (!Character.isLetterOrDigit(ch))
                return false;

            // vowel check
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                hasVowel = true;
            }
            // consonant check
            else if (Character.isLetter(ch)) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }
}

