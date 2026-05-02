class numofzero {
    public int numberOfSteps(int num) {
        return no(num,0);
    }
    static int no(int num,int steps){
        if(num == 0) return steps;
        if(num%2==0) return no(num/2,steps+1);
        else return no(num-1,steps+1);
    }
}