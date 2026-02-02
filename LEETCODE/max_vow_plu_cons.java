class max_vow_plu_cons {
    public int maxFreqSum(String s) {
       HashMap<Character, Integer> map_v = new HashMap<>();
       HashMap<Character, Integer> map_c = new HashMap<>();


       for(char ch : s.toCharArray()){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            map_v.put(ch, map_v.getOrDefault(ch, 0) + 1);
        }
        else{
            map_c.put(ch,map_c.getOrDefault(ch,0)+1);
        }
       }
        int max_v = 0, max_c = 0;
       for( int freq : map_v.values()){
        max_v = Math.max(max_v,freq);
       }

       for(int freq : map_c.values()){
        max_c = Math.max(max_c,freq);
       }

       return max_v+max_c;
       

    }
}