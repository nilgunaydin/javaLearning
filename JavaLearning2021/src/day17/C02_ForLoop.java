package day17;

import java.util.Scanner;

public class C02_ForLoop {

	public static void main(String[] args) {
		// stringi ters yazdýrko
		
Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen tersine yazdýrmak istediðiniz yazýyý yazýnýz");
		
		
		String str = scan.nextLine();
		
		for (int i = str.length()-1 ; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
		
	scan.close();}

}
