package day17;

import java.util.Scanner;

public class C08_hw {

	public static void main(String[] args) {
		// pozitif sayi iste �ekil �iz
		
		Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen pozitif bir say� giriniz");
	int num = scan.nextInt();
	for (int i=1;i<=num;i++) {
		for (int n=1;n<=i;n++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	scan.close();
	}

}
