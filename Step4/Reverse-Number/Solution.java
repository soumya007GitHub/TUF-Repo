class Main {
    static int reverseNumber(int n){
        int original = n;
        int reversed = 0;
        while(original > 0){
            reversed = reversed*10 +(original%10);
            original /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int result = reverseNumber(106700);
        System.out.print(result);
    }
}
