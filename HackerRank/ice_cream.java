public class ice_cream {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
    // Write your code here
        
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<arr.size(); i++){
            for(int j = i+1;j<arr.size();j++){
                
                    if(arr.get(i)+arr.get(j)==m){
                        ans.add(i+1);
                        ans.add(j+1);
                        
                    }
                }
            
        }
        return ans;
        
    }

}

