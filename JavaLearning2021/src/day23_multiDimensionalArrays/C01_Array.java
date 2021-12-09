package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		
		// Verilen bir array'den istenen degere sahip elementleri silip
				// kalani yeni bir array olarak kaydedin
				// ve sonra yeni array'i yazdirin
		
		int arr[]= {3,4,5,6,3,5,8,3,4,9};
		int clsnum=3;
		
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==clsnum) {
				sayac++;
			}}
	int newArrayLength=arr.length-sayac;
	//yeni arrayin uzunluðunu bulduk artýk yeni arrayi oluþturuyoruz
	int newarr[]=new int[newArrayLength];
	//þimdi elelmanlarý atayacaðýz
	int j=0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!= clsnum) {
	
			newarr[j]=arr[i];
			j++;
		}
		
		
		}
	System.out.println(Arrays.toString(newarr));}
}
