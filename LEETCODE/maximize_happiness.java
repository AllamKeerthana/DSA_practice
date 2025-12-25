class maximize_happiness {
    public long maximumHappinessSum(int[] happiness, int k) {
        // long sum = 0 ;
        // List<Integer> happy = new ArrayList<>();
        // for(int i:happiness){
        //     happy.add(i);
        // }
        // while(k>0){
        //     int m = happy.get(0);
        //     for(int i : happy){
        //         m = Math.max(m,i);
        //     }

           
        //    for (int i = 0; i < happy.size(); i++) {

        //     if (happy.get(i).equals(m)) {
        //         happy.remove(i);
        //         break;
        //     }
        //     }
        //     sum+=m;
        //     if(m>0){
        //         for(int i=0;i<happy.size();i++){
        //             happy.set(i, Math.max(0, happy.get(i) - 1));
                    
        //         }

        //     }
        //     else return sum;
        //     k--;
        // }

        // return sum;
        Arrays.sort(happiness);
        int dec =0, n = happiness.length;
        long sum=0;
        for(int i =n-1;i>=0 && k>0;i-- ){
            int current = happiness[i]-dec;

            if(current<=0) break;
            sum+=current;
            dec++;
            k--;
        }
        return sum;
    }
}