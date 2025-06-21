public class Main
{
    static void run(int counter, int n){
        if(counter > n) {
            return;
        }
        System.out.println(counter);
        run(++counter, n);
    }
	public static void main(String[] args) {
		run(1, 10);
	}
}
