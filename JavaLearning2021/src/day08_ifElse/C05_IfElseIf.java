package day08_ifElse;

import java.util.Scanner;

public class C05_IfElseIf {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
		//sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere 
		//sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin, sayilardan sifira esit olan varsa “sifir carpmaya gore
		//yutan elemandir” yazdirin.
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen iki sayý giriniz, ilk sayýdan sonra enter'a basýnýz...");
		
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		if (sayi1>0 & sayi2>0) {System.out.println("sayilarýn toplamý= "+ (sayi1+sayi2));
			
		} else if(sayi1<0 & sayi2<0) { System.out.println("sayilarýn çarpýmý ="+ sayi1*sayi2);
		
			
		} else if(sayi1*sayi2<0)  {System.out.println("farklý iþaretteki sayýlarla iþlem yapamazsýnýz." );

		} else {System.out.println("sýfýr çarpmaya göre yutan elemandýr.");}

		scan.close();
		}

	}

