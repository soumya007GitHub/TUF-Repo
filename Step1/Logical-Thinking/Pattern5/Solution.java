/* SAMPLE PATTERN
* * * * *
* * * *
* * *
* *
*
*/
public class Main
{
    static void seeding(int n){
        for(int i = n; i>=1; --i){
            for(int j = i; j>=1; --j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		seeding(5);
	}
}
