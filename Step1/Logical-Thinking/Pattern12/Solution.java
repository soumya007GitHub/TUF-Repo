// SAMPLE OUTPUT
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321
public class Main
{
    static void nTriangle(int n) {
	for(int i = 1; i<=n; ++i){
	    for(int j = 1; j<=i; ++j){
	        System.out.print(j);
	    }
	    for(int k = 1; k<=(n-i); ++k){
	        System.out.print(" ");
	    }
	    for(int k = (n-i); k>=1; --k){
	        System.out.print(" ");
	    }
	    for(int j = i; j>=1; --j){
	        System.out.print(j);
	    }
	    System.out.println();
	}
}
	public static void main(String[] args) {
	    nTriangle(5);
	}
}
