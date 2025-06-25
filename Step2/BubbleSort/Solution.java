public class Main
{
public static int[] bubbleSort(int[] array){
    int length = array.length;
    for(int i = length-1; i>=0; --i){
        for(int j = 0; j<i; ++j){
            if(array[j] > array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    return array;
}
	public static void main(String[] args) {
		int[] array = {5, 3, 8, 4, 2};
		int[] result = bubbleSort(array);
		for(int i = 0; i<result.length; ++i){
		    System.out.print(result[i]+" ");
		}
	}
}
