package day21_scope_arrays;

import java.util.Arrays;

public class C04_arrays {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,99};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
System.out.println(Arrays.toString(arr));
	}

}
