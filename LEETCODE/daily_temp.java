class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] arr = new int[n];
        Stack<Integer> s = new Stack<>();
        s.add(n-1);
        arr[n-1] = 0;
        for(int i = n-2;i>=0;i--){
            while(!s.isEmpty() && temperatures[s.peek()]<=temperatures[i]){
                s.pop();
            }
            if(s.isEmpty()) arr[i]=0;
            else{
                arr[i] = s.peek()-i;
            }
            s.push(i);
        }
        return arr;
    }
}