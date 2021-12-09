package day16;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// 100den kucuk sayý iste
		//1de baþla 3 ve 5 katlarýný yazdýr.
		
Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen 100 den küçük bir sayý yazýnýz");
		
		int sayi= scan.nextInt();
	for (int i = 1; i <= sayi; i++) {
		if (i%3==0 || i%5==0) {
			System.out.print(i+" ");
		} 
		
	}	
		
	scan.close();}

}
