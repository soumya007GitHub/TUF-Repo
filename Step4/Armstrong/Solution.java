public class Main
{
    static boolean armstrong(int n){
    int num = n;
    int result = 0;
    int digits = (int)(Math.log10(num)+1);
    while(num > 0){
        result = result + (int)Math.pow(num%10, digits);
        num /= 10;
    }
    if(result == n){
        return true;
    }
    else{
        return false;
    }
}
	public static void main(String[] args) {
		boolean result = armstrong(153);
		System.out.print(result);
	}
}
