public class Main
{
    static int[] reversedArray(int[] array){
        for(int i = 0; i<array.length/2; ++i){
            array[i] = array[i]+array[array.length-i-1];
            array[array.length-i-1] = array[i] - array[array.length-i-1];
            array[i] = array[i] - array[array.length-i-1];
        }
        return array;
  }
	public static void main(String[] args) {
	    int array[] = {2, 3, 4, 5, 3};
		int result[] = reversedArray(array);
		for(int i:result){
		    System.out.println(i);
		}
	}
}
