
import java.util.HashSet;
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dupli = new HashSet<>();

        for(int num:nums){
            if(dupli.contains(num)) return true;
            dupli.add(num);
        }
        return false;
    }
}