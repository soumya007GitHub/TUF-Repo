public class Main
{
    // USING BACKTRACKING TECHNIQUE
    static void run(int counter){
        if(counter < 1){return;}
        run(counter - 1);
        System.out.println(counter);
    }
	public static void main(String[] args) {
		run(4);
	}
}
