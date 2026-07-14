class StockSpanner {
    Stack<Integer> s; 
    List<Integer> arr; 

    public StockSpanner() {
        s = new Stack<>();
        arr = new ArrayList<>();
    }

    public int next(int price) {
        arr.add(price);
        int i = arr.size()-1;
        while(!s.isEmpty() && arr.get(s.peek()) <= price){
            s.pop();
        }
        int span;
        if(s.isEmpty()) span= i+1;
        else span = i-s.peek();
        s.push(i);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */