package day12;

import java.util.Scanner;

public class c01_indexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lurfen bir cumle giriniz...");
		
		String cumle = scan.nextLine();
		
		System.out.println("l�tfen bir harf yaz�n�z...");
		
		char h = scan.next().charAt(0);
				
		int ind = cumle.indexOf(h);
		
		if (ind<0) {System.out.println("girdi�iniz harf c�mlede yok");
		
	} else {System.out.println("girdi�iniz harf c�mlede var.");
	
		}
	
	scan.close();
	
	}
	
	

}
