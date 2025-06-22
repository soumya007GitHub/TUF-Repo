import java.util.HashMap;

public class Main
{
    public static void checkFrequency(int[] array){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int arraySize = array.length;
        for(int i = 0; i<arraySize; ++i){
            if (mpp.containsKey(array[i]))
        {
            mpp.put(array[i], mpp.get(array[i]) + 1);
        }
        else{
            mpp.put(array[i], 1);
        }
        }
        for(int z: mpp.keySet()){
            System.out.println(z+" : "+mpp.get(z));
        }
    }
	public static void main(String[] args) {
		int[] array = {1, 2, 2, 5, 6, 3, 4};
		checkFrequency(array);
	}
}
