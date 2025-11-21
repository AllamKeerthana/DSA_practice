public class rotation{
    public static void main(String[] args){
        String s1 = "abcde";
        String s2 = "deabe";
        boolean result = false;
        String str = s1+s1;
        if(str.contains(s2)) result = true;

        System.out.println(result);
    }
}