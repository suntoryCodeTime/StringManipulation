import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        
		if(candies == null){
            return null;
        }
        
        int max = 0;
        
        
        //First find max
        for(int candy : candies){
            if(candy > max)
                max = candy;
        }
        
        List<Boolean> greatest = new ArrayList<>();
        
        for(int candy : candies){
            
            if((candy + extraCandies) >= max)
                greatest.add(true);
            else
                greatest.add(false);
            
            
               
        }
   
        return greatest;
	     
	    }
}
