package firstWeek.Day2;

public class IsPrime {
	public static void main(String[] args) {
		
		int input =13;
		boolean isprimeNumber=true;
		if(input <= 1) isprimeNumber= false;
		else {
			for(int i=2; i < Math.sqrt(input); i++) {
				if(input%i==0) {
					isprimeNumber= false;
					break;
				}
			}
		}
		
		
		if(isprimeNumber) {
			System.out.println("The given number is primeNumber");
		}else {
			System.out.println("The given number is not primeNumber");
		}
		
	}

}
