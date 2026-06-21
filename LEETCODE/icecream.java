class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        if(costs[0]>coins) return 0;

        int count = 0;
        int total = 0;
        for(int num:costs){
            total+=num;
            count++;
            if(total==coins){
                break;
            }
            if(total>coins){
                count-=1;
                break;
            }
        }
        return count;
    }
}