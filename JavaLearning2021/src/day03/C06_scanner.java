package day03;

import java.util.Scanner;

public class C06_scanner {

	public static void main(String[] args) {
		// Scanner isleminde String icin 2 method vardir
Scanner scan= new Scanner(System.in );
		
		System.out.println("Lutfen isminizi giriniz...");
		
		String isim=scan.nextLine();
		
		System.out.println("Lutfen Soyisminizi Yaziniz");
		
		String soyisim= scan.nextLine();
		
		
		System.out.println("girilen isim : "+ isim+" "+soyisim);
		scan.close();

	}

}
