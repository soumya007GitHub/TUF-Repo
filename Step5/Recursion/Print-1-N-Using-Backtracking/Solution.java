public class Main
{
    // USING BACKTRACKING TECHNIQUE
    static void run(int counter, int num){
        if(counter < 1){return;}
        run(counter - 1, num);
        System.out.println(counter);
    }
	public static void main(String[] args) {
		run(4, 4);
	}
}
