// SAMPLE pattern
// A 
// BB 
// CCC 
// DDDD
// EEEEE
public class Main
{
    static void pattern(int n){
        int letter = 65;
    for(int i = 1; i<=n; ++i){
        for(int j = 0; j<i; ++j){
            System.out.print((char)letter);
        }
        ++letter;
        System.out.println();
    }
}
	public static void main(String[] args) {
		pattern(5);
	}
}
