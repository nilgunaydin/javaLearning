package day16;


import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// 100den k���k girilen say�ya kadar 3�n katlar�
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("l�tfen 100 den k���k bir say� yaz�n�z");
		
		double sayi= scan.nextDouble();
		int num = (int) sayi;
		
		if(sayi<0) {System.out.println("negatif sayi giremezsiniz...");
		}
		else if(num!=sayi) {System.out.println("l�tfen tam say� giriniz...");}
		else {
		
		
		 
		for (int i =1 ; i <sayi; i++) {
			if(i%3==0)
				{System.out.print(i+", ");
		}}
		 if (sayi%3==0) {System.out.println(sayi);}
			scan.close();}

} }
