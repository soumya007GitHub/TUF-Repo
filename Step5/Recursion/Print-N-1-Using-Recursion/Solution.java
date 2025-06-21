public class Main
{
    static void run(int n){
        if(n == 0){return;}
        System.out.println(n);
        run(--n);
        
    }
	public static void main(String[] args) {
		run(4);
	}
}
