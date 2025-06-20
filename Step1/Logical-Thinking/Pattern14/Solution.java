// SAMPLE PATTERN
// A 
// AB 
// ABC 
public class Main
{
    static void pattern(int n){
    for(int i = 1; i<=n; ++i){
        for(int j = 65; j<(65+i); ++j){
            System.out.print((char)j);
        }
        System.out.println();
    }
}
	public static void main(String[] args) {
		pattern(3);
	}
}
