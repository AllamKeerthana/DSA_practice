public class gemstone {
   public static int gemstones(List<String> arr) {
    // Write your code here
        int[] freq = new int[26];
        int n = arr.size();
        
        for(String str : arr){
            Set<Character> seen = new HashSet<>();
            
            for(char ch : str.toCharArray()){
                seen.add(ch);
            }
            
            for(char ch: seen){
                freq[ch-'a']++;
            }
        }
        
        int count = 0;
        for(int val : freq){
            if(val>=n) count++;
        }
        
        return count;
    }

}
