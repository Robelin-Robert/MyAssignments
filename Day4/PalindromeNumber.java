package firstWeek.Day4;

public class PalindromeNumber {
	public static void main(String[] args) {
		int input=123;
	      int output=321;
	      int rem;
	      int reverse=0;
	      for(int i=input; i>0;) {
	    	  rem = i%10;
	    	  reverse= reverse*10+rem;
	    	     i=i/10;
	      }
	      if(reverse==input) {
	    	  System.out.println("The given input is palindrome");
	      }else {
	    	  System.out.println("The given input is not palindrome");
	      }
	}
      
}
