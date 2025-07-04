public class Main
{
    public static int fib(int n) {
        int[] arr = new int[n + 1];
            if(n <= 1){
                return n;
            }
            else{
                arr[0] = 0;
                arr[1] = 1;
                for(int i = 2; i<=n; ++i){
                    arr[i] = arr[i-1]+arr[i-2];
                }
            }
        return arr[n];
    }
	public static void main(String[] args) {
		int result = fib(3);
		System.out.println(result);
	}
}
