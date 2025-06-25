public class Main
{
    public static int[] insertionSort(int[] array){
        for(int i = array.length-1; i>=0; --i){
            for(int j = 0; j<i; ++j){
                if(array[j+1]<array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
	public static void main(String[] args) {
		int[] array = {13,46,24,52,20,9};
		int[] result = insertionSort(array);
		for(int i = 0; i<result.length; ++i){
		    System.out.print(result[i]+" ");
		}
	}
}
