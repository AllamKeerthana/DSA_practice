import java.util.HashMap;

public class majority_element {

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        int n = nums.length;
        for(int i: nums){
            ans.put(i,ans.getOrDefault(i,0)+1);
        }
        int result = 0;
        for(int i : ans.keySet()){
            if(ans.get(i) > n/2) result = i;
        }
        return result;
    }
}

