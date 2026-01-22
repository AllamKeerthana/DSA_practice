public class cnt_ele_max_freq {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max =0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
            }
        }
        int count =0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                count+=max;
            }
        }
        return count;
    }
}
