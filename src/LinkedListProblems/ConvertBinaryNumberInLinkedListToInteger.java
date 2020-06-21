package LinkedListProblems;

public class ConvertBinaryNumberInLinkedListToInteger {
	
	
	public int getDecimalValue(ListNode head) {
		int decimal = 0;
		
		 // Traverse linked list  
	    while (head != null)  
	    {  
	        // Multiply result by 2 and add  
	        // head's data  
	        decimal = (decimal << 1) + head.val;
	        //decimal = 2*(decimal) + head.val;  
	        /*
	         * num = num<<1;
             * num = num | head.val;
	         * */
	  
	        // Move next  
	        head = head.next;  
	    } 
		
		return decimal;
	}
	
	
	public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  
	}


}
