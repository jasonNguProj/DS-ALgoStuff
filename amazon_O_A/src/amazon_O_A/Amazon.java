package amazon_O_A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Amazon {
// box optimize question
	public static Set<Integer> findSet(int[] arr) {
		long totalSum = 0;
		int aSum = 0;
		Set<Integer> result = new TreeSet<>();
		for (int i : arr) {
			totalSum += i;
		}
		
		Arrays.sort(arr);
		
		for(int i = arr.length - 1 ; i >= 0; i--) {
			result.add(arr[i]);
			aSum += arr[i];
			if(aSum > totalSum - aSum) break;
		}
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Integer> vals = findSet(new int[] {3,7,5,6,2});
		System.out.println(findSet(new int[] {3,7,5,6,2}));
	}

}
