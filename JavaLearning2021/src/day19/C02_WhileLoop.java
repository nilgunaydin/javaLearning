package day19;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin
		//ve bu sayinin rakamlari toplamini yazdirin
	Scanner scan = new Scanner(System.in);
	System.out.println("lütfen rakamlar toplamýný öðrenmek istediðiniz sayýyý giriniz");
	long sayi = scan.nextLong();
	int rakam=7;
	int raktop=0;
			while(sayi>0) {
				rakam=(int) (sayi%10);
				raktop+=rakam;
				sayi/=10;
			}
			System.out.println("girdiðiniz sayýnýn rakamlar toplamý = "+ raktop);
	scan.close();
	}

}
