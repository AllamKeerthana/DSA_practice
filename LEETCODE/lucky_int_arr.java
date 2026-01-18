import java.util.HashMap;
import java.util.Map;


  class lucky_int_arr {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans=-1;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            if(entry.getKey().equals(entry.getValue())){
                ans = entry.getKey();                 
            }
        }
        return ans;
    }
}
