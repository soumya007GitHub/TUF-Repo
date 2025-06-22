import java.util.*;

public class Main
{
    public static int mostFrequentElement(int[] nums) {
        int arrayLength = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i<arrayLength; ++i){
            if(mpp.containsKey(nums[i])){
                mpp.put(nums[i], mpp.get(nums[i]) + 1);
            }
            else{
                mpp.put(nums[i], 1);
            }
        }
        int maxFreq = -1;
        int result = Integer.MAX_VALUE;
        for(HashMap.Entry<Integer, Integer> i:mpp.entrySet()){
            int key = i.getKey();
            int freq = i.getValue();
            if(freq > maxFreq){
                maxFreq = freq;
                result = key;
            }
            else if(freq == maxFreq && key<result){
                result = key;
            }
        }
        return result;
    }


	public static void main(String[] args) {
		int[] array = {4, 4, 5, 5, 6};
		int result = mostFrequentElement(array);
		System.out.println(result);
	}
}
