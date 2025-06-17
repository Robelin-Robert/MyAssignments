package secondWeek.Day1;

public class ReverseOddNumber {
public static void main(String[] args) {
	
	String input="i am a software Tester";
	String[] split = input.split(" ");
	for(int i=0; i< split.length; i++) {
		if(i%2 != 0) {
			char[] ca = split[i].toCharArray();
			String reverse="";
			for(int j=ca.length-1; j>=0 ; j--) {
				reverse= reverse+ca[j];
				
			}
			System.out.print(reverse+" ");
		}else {
			System.out.print(split[i]+" ");
		}
		
		
}
}
}
