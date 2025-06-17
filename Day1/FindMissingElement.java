package secondWeek.Day1;

import java.util.Arrays;
import java.util.Iterator;

public class FindMissingElement {
public static void main(String[] args) {
	
	int arr[]= {1,4,3,2,8,6,7};
	Arrays.sort(arr);
	
	boolean missingNumber=false;
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i+1] != arr[i]+1) {
			 missingNumber = true;
			 System.out.println("found the missing number: "+ (arr[i]+1));
			 break;
		}
	}
}
}
