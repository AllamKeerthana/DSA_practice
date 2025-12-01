

import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Find_sub_word {

    // check if a character is a valid word-character
    static boolean isWordChar(char c) {
        return Character.isLetterOrDigit(c) || c == '_';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] sentences = new String[n];

        // read all n sentences
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        int q = Integer.parseInt(sc.nextLine());

        // process each query
        for (int qi = 0; qi < q; qi++) {
            String sub = sc.nextLine();
            int count = 0;

            for (String sentence : sentences) {

                // split by NON-word characters
                String[] words = sentence.split("[^a-zA-Z0-9_]+");

                for (String word : words) {

                    if (word.length() <= sub.length()) continue;

                    // check all possible starting positions
                    for (int i = 0; i <= word.length() - sub.length(); i++) {

                        // check substring match
                        if (word.regionMatches(i, sub, 0, sub.length())) {

                            // BEFORE check
                            if (i == 0 || !isWordChar(word.charAt(i - 1))) {
                                continue;
                            }

                            // AFTER check
                            if (i + sub.length() >= word.length()
                                || !isWordChar(word.charAt(i + sub.length()))) {
                                continue;
                            }

                            count++;
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
}


