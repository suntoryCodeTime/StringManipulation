
public class ArrayShuffle {

	 public static int[] shuffle(int[] nums, int n) {
	        if(nums == null || nums.length <= 2)
	            return nums;
	        
	        int[] shuffled = new int[2*n];
	        
	        //shuffled[0] = nums[0];
	        //shuffled[nums.length-1] = num[nums.length-1];
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
