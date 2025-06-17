package secondWeek.Day1;

public class RemoveDuplicateWords {

public static void main(String[] args) {
	String str="We learn java basics as part of java session in java week 1";
	String[] split = str.split(" ");
	
	for(int i=0; i<split.length; i++) {
		int count=0;
		for(int j=0; j<split.length; j++) {
		if(split[i].equalsIgnoreCase(split[j])) {
			count++;
			if(count>1) {
				split[j]="";
			}
		}
		}
		System.out.print(split[i]+" ");
	}
	
}	
	

}
