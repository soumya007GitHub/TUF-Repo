public class Main
{
     public static int[] selectionSort(int[] nums) {
        for(int i = 0; i<=nums.length-1; ++i){
            int initial = i;
            for(int j = i+1; j<nums.length; ++j){
                if(nums[j]<nums[initial]){
                    initial = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[initial];
            nums[initial] = temp;
        }
        return nums;
    }
	public static void main(String[] args) {
	    int[] array = {7, 4, 1, 5, 3};
	    int[] result = selectionSort(array);
	    for(int i = 0; i<result.length; ++i){
	        System.out.print(result[i]+" ");
	    }
	}
}
