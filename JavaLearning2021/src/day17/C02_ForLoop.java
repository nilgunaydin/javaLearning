package day17;

import java.util.Scanner;

public class C02_ForLoop {

	public static void main(String[] args) {
		// stringi ters yazd�rko
		
Scanner scan= new Scanner(System.in);
		
		System.out.println("l�tfen tersine yazd�rmak istedi�iniz yaz�y� yaz�n�z");
		
		
		String str = scan.nextLine();
		
		for (int i = str.length()-1 ; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
		
	scan.close();}

}
