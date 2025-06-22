public class Main
{
    static String reverse(String name, int startIndex, int endIndex) {
        char[] array = name.toCharArray();
        if(startIndex == endIndex){return new String(array);}
        char temp = array[startIndex];
        array[startIndex] = array[endIndex];
        array[endIndex] = temp;
        return reverse(new String(array), ++startIndex, --endIndex);
    }
	public static void main(String[] args) {
	    String name = "MADAM";
	    int startIndex = 0;
	    int endIndex = name.length()-1;
	    String result = reverse(name, startIndex, endIndex);
	    System.out.println(result.equals(name)?true:false);
	    return;
	}
}
