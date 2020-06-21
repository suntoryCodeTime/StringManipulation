package StringAndArrayManipulation;
/**
 * 
 * NOTE: Unless a problem explicitly states DO NOT allocate more memory
 * for another array, feel free to use an array.
 * 
 * */


public class ArrayShuffle {

	 public static int[] shuffle(int[] nums, int n) {
	        if(nums == null || nums.length <= 2)
	            return nums;
	        
	        int[] shuffled = new int[2*n];
	        
	        int beginning = 0;
	        int middle = n;
	        
	        for(int i = 0; i < nums.length; i++){
	            
	            //Even
	            if(i % 2 == 0){
	                shuffled[i] = nums[beginning];
	                beginning++;
	            }
	            
	            //Odd
	            else{
	                shuffled[i] = nums[middle];
	                middle++;
	            }
	        }
	        return shuffled;
	    }
}
