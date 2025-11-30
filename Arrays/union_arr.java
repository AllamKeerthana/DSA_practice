import java.util.ArrayList;
import java.util.List;

public class union_arr {

    public int[] unionArray(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int n = nums1.length, m = nums2.length;

        List<Integer> arr = new ArrayList<>();

        while(i < n && j < m){

            if(nums1[i] == nums2[j]){
                if(arr.size() == 0 || arr.get(arr.size()-1) != nums1[i])
                    arr.add(nums1[i]);
                i++; 
                j++;
            }
            else if(nums1[i] < nums2[j]){
                if(arr.size() == 0 || arr.get(arr.size()-1) != nums1[i])
                    arr.add(nums1[i]);
                i++;
            }
            else{
                if(arr.size() == 0 || arr.get(arr.size()-1) != nums2[j])
                    arr.add(nums2[j]);
                j++;
            }
        }

        while(i < n){
            if(arr.size() == 0 || arr.get(arr.size()-1) != nums1[i])
                arr.add(nums1[i]);
            i++;
        }

        while(j < m){
            if(arr.size() == 0 || arr.get(arr.size()-1) != nums2[j])
                arr.add(nums2[j]);
            j++;
        }

        // convert list to array
        int[] ans = new int[arr.size()];
        for(int a = 0; a < ans.length; a++){
            ans[a] = arr.get(a);
        }

        return ans;
    }

    public static void main(String[] args) {

        union_arr ua = new union_arr();

        int[] nums1 = {1,2,2,3,5};
        int[] nums2 = {2,3,4,6};

        int[] res = ua.unionArray(nums1, nums2);

        for(int x : res){
            System.out.print(x + " ");
        }
    }

}
