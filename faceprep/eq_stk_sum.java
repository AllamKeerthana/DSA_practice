import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] s1 = new int[n1];
        int sum1 = 0;

        for(int i = 0; i < n1; i++){
            s1[i] = sc.nextInt();
            sum1 += s1[i];
        }

        int n2 = sc.nextInt();
        int[] s2 = new int[n2];
        int sum2 = 0;

        for(int i = 0; i < n2; i++){
            s2[i] = sc.nextInt();
            sum2 += s2[i];
        }

        int n3 = sc.nextInt();
        int[] s3 = new int[n3];
        int sum3 = 0;

        for(int i = 0; i < n3; i++){
            s3[i] = sc.nextInt();
            sum3 += s3[i];
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while(true){

            if(i == n1 || j == n2 || k == n3){
                System.out.print(0);
                return;
            }

            if(sum1 == sum2 && sum2 == sum3){
                System.out.print(sum1);
                return;
            }

            if(sum1 >= sum2 && sum1 >= sum3){
                sum1 -= s1[i];
                i++;
            }
            else if(sum2 >= sum1 && sum2 >= sum3){
                sum2 -= s2[j];
                j++;
            }
            else{
                sum3 -= s3[k];
                k++;
            }
        }
    }
}