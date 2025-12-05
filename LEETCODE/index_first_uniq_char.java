public class index_first_uniq_char {
        int firstUniqChar(String s) {
        int n = s.length();
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }

        int result = -1;
        for(int i = 0;i<n;i++){
            if(freq[s.charAt(i) - 'a']==1) {
                result = i;
                break;
            }
        }
        return result;
    }
}

