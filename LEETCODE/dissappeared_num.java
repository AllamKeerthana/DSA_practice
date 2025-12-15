import java.util.ArrayList;
import java.util.List;

public class dissappeared_num {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] freq = new int[nums.length];
        for(int i : nums){
            freq[i-1]++;
        }
        List<Integer> ans = new ArrayList<>();

        for(int val = 0; val<nums.length;val++){
            if(freq[val]==0) ans.add(val+1);
        }
        return ans;
    }
}

