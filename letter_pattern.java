class letter_pattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i =0;i<n;i++){
            for(int j = 0;j<=i;j++){
                int ch = 65;
                System.out.print((char)(ch+(4-i+j-1)));
                
            }
            System.out.println();
        }
    }
}