class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set1 = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            String s = Integer.toString(arr1[i]);
            for(int j = 0; j<s.length();j++){
                String sub = s.substring(0,j+1);
                set1.add(sub);
            }
        }
        int max = 0;
        for(int i = 0;i<arr2.length;i++){
            String s = Integer.toString(arr2[i]);
            for(int j = 0;j<s.length();j++){
                String sub = s.substring(0,j+1);
                if(set1.contains(sub)){
                    int c = sub.length();
                    max = Math.max(c,max);
                }
            }

        }
        return max;
    }
}