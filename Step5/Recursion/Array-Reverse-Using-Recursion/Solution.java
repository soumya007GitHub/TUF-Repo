public class Main
{
    static int[] reversedArray(int[] array, int startIndex, int endIndex){
        if(startIndex < endIndex){
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] =  temp;
            reversedArray(array, ++startIndex, --endIndex);
        }
        return array;
    }
	public static void main(String[] args) {
	    int[] array = {2, 3, 4, 5, 3, 8};
	    int startIndex = 0;
	    int endIndex = array.length-1;
	    int[] result = reversedArray(array, startIndex, endIndex);
	    for(int i:result){
	        System.out.println(i);
	    }
	}
}
