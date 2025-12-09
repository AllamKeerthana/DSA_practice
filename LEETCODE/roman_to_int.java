class roman_to_int {
    public int romanToInt(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        
        int sum = 0;
        for(char ch = 0;ch<s.length()-1;ch++){
            int cur = map.get(s.charAt(ch));
            int next = map.get(s.charAt(ch+1));
            if(next>cur){
                sum+=-cur;
            }
            else{
                sum+=cur;
            }
        }
        sum+=map.get(s.charAt(s.length()-1));
        return sum; 
    }
}