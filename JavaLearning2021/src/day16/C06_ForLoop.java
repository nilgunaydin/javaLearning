package day16;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// 100den kucuk say� iste
		//1de ba�la 3 ve 5 katlar�n� yazd�r.
		
Scanner scan= new Scanner(System.in);
		
		System.out.println("l�tfen 100 den k���k bir say� yaz�n�z");
		
		int sayi= scan.nextInt();
	for (int i = 1; i <= sayi; i++) {
		if (i%3==0 || i%5==0) {
			System.out.print(i+" ");
		} 
		
	}	
		
	scan.close();}

}
