public class Main
{
    static void run(int counter, int n){
        if(counter > n) {return;}
        System.out.println("Soumya");
        run(++counter, n);
    }
	public static void main(String[] args) {
		run(1, 3);
	}
}
