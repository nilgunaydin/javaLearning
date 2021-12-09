package day16;


import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// 100den küçük girilen sayýya kadar 3ün katlarý
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen 100 den küçük bir sayý yazýnýz");
		
		double sayi= scan.nextDouble();
		int num = (int) sayi;
		
		if(sayi<0) {System.out.println("negatif sayi giremezsiniz...");
		}
		else if(num!=sayi) {System.out.println("lütfen tam sayý giriniz...");}
		else {
		
		
		 
		for (int i =1 ; i <sayi; i++) {
			if(i%3==0)
				{System.out.print(i+", ");
		}}
		 if (sayi%3==0) {System.out.println(sayi);}
			scan.close();}

} }
