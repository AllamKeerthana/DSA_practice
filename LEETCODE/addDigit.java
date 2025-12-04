class addDigits {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
// for the follow up we should not use the loops or recursions so we can use 
//if (num == 0) return 0;
//return 1 + (num - 1) % 9;
