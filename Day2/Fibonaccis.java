package firstWeek.Day2;

public class Fibonaccis {
	public static void main(String[] args) {
		
	
	 int input = 8;                     
     int first = 0, second = 1;

     System.out.print("Fibonacci up to " + input + " terms: ");
     for (int i = 1; i <= input; i++) {
         System.out.print(first + " ");
         int next = first + second;
         first = second;
         second = next;

}
}
}
