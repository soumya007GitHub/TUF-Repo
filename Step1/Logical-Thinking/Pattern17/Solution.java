class Main {
    static void pattern(int n){
    int letter = 65;
    for(int i = 1; i<=n; ++i){
        for(int k = 1; k<=(n-i); ++k){
            System.out.print(" ");
        }
        for(int j = 65; j<65+i; ++j){
           System.out.print((char)j);
           ++letter;
        }
        for(int l = letter-2; l>=65; --l){
            if(i == 1) continue;
            else{
                System.out.print((char)l);
            }
        }
        letter = 65;
        System.out.println();
    }
}
    public static void main(String[] args) {
        pattern(5);
    }
}
