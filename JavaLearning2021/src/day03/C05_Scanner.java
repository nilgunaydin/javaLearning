package day03;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		// kullanicidan isim ve soy isim ayr� ayr� isteyip
		//girilen ismi a�agidaki gibi yaziniz.
		// girilen isim : Mehmet Bulutluoz
		
		Scanner scan= new Scanner(System.in );
		
		System.out.println("Lutfen isminizi giriniz...");
		
		String isim=scan.next();
		
		System.out.println("Lutfen Soyisminizi Yaziniz");
		
		String soyisim= scan.next();
		
		
		System.out.println("girilen isim : "+ isim+" "+soyisim);
		scan.close();

	}

}
