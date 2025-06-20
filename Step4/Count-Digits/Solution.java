class Main {
    static int countDigit(int n){
    int num = n;
    int count = 0;
    while(num>0){
        ++count;
        num = num/10;
    }
    return count;
    }
    public static void main(String[] args) {
        int result = countDigit(893);
        System.out.print(result);
    }
}
