package day21_scope_arrays;

import java.util.Arrays;

public class C06_arrays {

	public static void main(String[] args) {
		//verilen arrayin elemanlarýnýn hepsini toplayan bir kod
		
		
int arr[]= {3,5,5,2};
int toplam=0;
	for (int i = 0; i < arr.length; i++) {
		toplam+=arr[i];
	}
	System.out.println("elementlerin toplamý: " + toplam);
	
	//array in tüm elemanlarýný b-k ve k-b sýrala
	
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));        
	
	
	int tersarr[]= new int[arr.length];
	for (int i =arr.length-1; i>=0; i--) {
		
		tersarr[i]=arr[arr.length-i-1];
	}
	System.out.println(Arrays.toString(tersarr));
	
	
	
	
	}

}
