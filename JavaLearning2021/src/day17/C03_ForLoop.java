package day17;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		
Scanner scan= new Scanner(System.in);
		
		System.out.println("l�tfen tersine yazd�rmak istedi�iniz yaz�y� yaz�n�z");
		
		
		String str = scan.nextLine();
		
		
		
		System.out.println(TersCevir(str));
	scan.close();	}
		
	private static String TersCevir(String str) {
		
			String tersi="";
		for (int i = str.length()-1 ; i >= 0 ; i--) {
		
			tersi+=str.charAt(i);
		
		
		
	}
return tersi;
}
}


