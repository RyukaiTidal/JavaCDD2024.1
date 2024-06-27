package Arrays;

import java.util.Arrays;

public class No06 {

	public static void main(String[] args) {
		int num[] = {20,17,22,18,36,57,80};
		int numrev[] = new int[7];
		int numcres[] = {20,17,22,18,36,57,80};
		for(int i = 6, o = 0; i > num.length-(num.length+1); i--, o++) {
			System.out.print(num[i] + " ");
			numrev[o] = num[i];
		}
		System.out.println();
		
		Arrays.sort(numcres);
		
		for(int b = 0; b < num.length; b++) {
			System.out.print(num[6-b] + " ");	
		}
	}

}
