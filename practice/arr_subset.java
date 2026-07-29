
import java.util.*;
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        int n = a.length;
        int m = b.length;
        if(m>n) return false;
        HashMap<Integer,Integer> mapa = new HashMap<>();
        for(int i : a){
            mapa.put(i,mapa.getOrDefault(i,0)+1);
        }
        HashMap<Integer,Integer> mapb = new HashMap<>();
        for(int i : b){
            if(!mapa.containsKey(i)) return false;
            mapb.put(i,mapb.getOrDefault(i,0)+1);
        }
        
        for(int i : b){
            int ma = mapa.get(i);
            int mb = mapb.get(i);
            if(mb>ma) return false;
        }
        
        
        return true;
    }
}
