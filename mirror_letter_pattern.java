public class mirror_letter_pattern {
    public static void main(String[] args){
        int n = 4;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }

            char ch = 'A';
            int sum = 2*i+1;
            int mid = (int)sum/2;

            for(int j = 0;j<sum;j++){
                System.out.print(ch);
                if(j<mid) ch++;
                else ch--;
            }

            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();   
            
        }
    }
}
