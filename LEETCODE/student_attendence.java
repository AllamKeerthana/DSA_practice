class student_attendence {
    public boolean checkRecord(String s) {
        int a = 0;
       for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='A') a++;
            if(s.charAt(i)=='L'){
                if(i-1>=0&&i+1<s.length()){
                    if(s.charAt(i-1)=='L' && s.charAt(i+1)=='L'){
                        return false;
                    }
                }
            }
       }
       if(a>1){
        return false;
       }
       return true; 
    }
}