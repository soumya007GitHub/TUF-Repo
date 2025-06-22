public class Main
{
    public static void frequencyChecker(int[] array, int arraySize){
        int[] hashArray = new int[arraySize];
        for(int i = 0; i<arraySize; ++i){
            ++hashArray[array[i]];
        }
        for(int z = 0; z<arraySize; ++z){
            System.out.println(z+" appears: "+hashArray[z]+" times");
        }
    }
	public static void main(String[] args) {
		int[] array = {2,2,3,4,4,2};
		int arraySize = array.length;
		frequencyChecker(array, arraySize);
	}
}
