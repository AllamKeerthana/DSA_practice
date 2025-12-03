import java.util.HashMap;

public class single_number_1 {

    public int singleNumber(int[] nums) {

        //your code goes here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i : nums){
            if(map.get(i)==1) return i;
        }
        
        return -1;
    }
}


