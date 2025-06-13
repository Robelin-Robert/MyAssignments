package firstWeek.Day2;

public class CheckNumberIsPositive {
	
	public static void main(String[] args) {
		int input= 10;
		boolean ispositive= true;
		if(input<=0) ispositive= false;
		else if(input >= 1) {
			ispositive= true;
			
		}
		
		if(ispositive) {
			System.out.println("The given input is positive");
		}else {
			System.out.println("The given input is not a positive");
		}
	}

}
