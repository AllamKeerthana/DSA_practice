class del_col {
    public int minDeletionSize(String[] strs) {
        int count =0;
        int size = strs[0].length();
        int n = strs.length;
        for(int i =0;i<size;i++){
            for(int j = 1;j<n;j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    count++;
                    break;
                }            
            }
        }
        return count;   
    }
}