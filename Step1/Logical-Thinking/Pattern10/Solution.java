public class Main
{
     static void triangle(int n) {
        for(int i = 0;i<n; ++i){
            for(int j = 0; j<=i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void reversedTriangle(int n){
        for(int i = n-1; i>=1; --i){
            for(int j = i; j>=1; --j){
               System.out.print("* ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		triangle(3);
		reversedTriangle(3);
	}
}
