class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] flag = new boolean[arr.length];
        return ans(arr,start,flag);
    }
    public boolean ans(int[] arr, int index, boolean[] flag){
        if(index<0 || index>=arr.length) return false;
        if(flag[index]) return false;

        if(arr[index]==0) return true;
        flag[index] = true;

        return ans(arr,index-arr[index],flag) || ans(arr,index+arr[index],flag);
    }
}