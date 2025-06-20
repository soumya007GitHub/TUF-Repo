// SAMPLE PATTERN
// C
// BC
// ABC
class Main {
    static void pattern(int n){
    int letter = 65+n-1;
    for(int i = 1; i<=n; ++i){
        for(int j = 1; j<=i; ++j){
            System.out.print((char)letter);
            ++letter;
        }
        System.out.println();
        letter = letter - i-1;
    }
}
    public static void main(String[] args) {
        pattern(3);
    }
}
