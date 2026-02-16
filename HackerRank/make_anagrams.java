    public static int makingAnagrams(String s1, String s2) {
    // Write your code here
        int[] freq = new int[26];
        for(char ch : s1.toCharArray()){
            freq[ch-'a']++;
        }
        
        for(char ch : s2.toCharArray()){
            freq[ch-'a']--;
        }
        int total = 0;
        for(int i = 0;i<26;i++){
            total+=Math.abs((freq[i]));
        }
        
        return total;
        
    }

}