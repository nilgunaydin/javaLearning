package day08_ifElse;

import java.util.Scanner;

public class C05_IfElseIf {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
		//sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere 
		//sahipse �farkli isaretlerde sayilarla islem yapamazsin� yazdirin, sayilardan sifira esit olan varsa �sifir carpmaya gore
		//yutan elemandir� yazdirin.
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("l�tfen iki say� giriniz, ilk say�dan sonra enter'a bas�n�z...");
		
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		if (sayi1>0 & sayi2>0) {System.out.println("sayilar�n toplam�= "+ (sayi1+sayi2));
			
		} else if(sayi1<0 & sayi2<0) { System.out.println("sayilar�n �arp�m� ="+ sayi1*sayi2);
		
			
		} else if(sayi1*sayi2<0)  {System.out.println("farkl� i�aretteki say�larla i�lem yapamazs�n�z." );

		} else {System.out.println("s�f�r �arpmaya g�re yutan elemand�r.");}

		scan.close();
		}

	}

