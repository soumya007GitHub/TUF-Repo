class Main {
    static int countDigit(int n){
    int num = n;
    int count = 0;
    while(num%10 != 0){
        num = num/10;
        ++count;
    }
    return count;
    }
    public static void main(String[] args) {
        int result = countDigit(893);
        System.out.print(result);
    }
}
