public class Main
{
    static void nForest(int n) {
	for(int i = 0; i<n; ++i){
		for(int j = n-1; j>=0; --j){
			System.out.print("* ");
		}
		System.out.print("\n");
	}
}
	public static void main(String[] args) {
		nForest(3);
	}
}
