class Solution {
    public String convert(String s, int numRows) {
        int row = 0;
        boolean down = false;
        List<StringBuilder> rows = new ArrayList<>();
        for(int i = 0; i<numRows;i++) rows.add(new StringBuilder());
        if(numRows==1) return s;
        for(char ch : s.toCharArray()){
            rows.get(row).append(ch);
            if(row==0){
                down = true;
            }
            if(row==numRows-1){
                down=false;
            }

            if(down) row++;
            else row--;
        }

        StringBuilder str = new StringBuilder();
        for(StringBuilder i : rows){
            str.append(i);
        }
        return str.toString();
    }
}