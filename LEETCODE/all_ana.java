class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] need = new int[26];
        int[] freq = new int[26];
        int len = p.length();
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()) return ans;
        int l = 0;
        for(char ch : p.toCharArray()){
            need[ch-'a']++;
        }
        for(int r = 0;r<s.length();r++){
            char ch = s.charAt(r);
            freq[ch-'a']++;
            if(r-l+1==len){
                if(same(need,freq)) ans.add(l);
                char lt = s.charAt(l);
                freq[lt-'a']--;
                l++;
            }
        }
        return ans;
    }
    static boolean same(int[] a, int[] b){
        for(int i = 0; i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}