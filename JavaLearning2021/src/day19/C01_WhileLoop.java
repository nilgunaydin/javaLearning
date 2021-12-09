package day19;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
		//ve toplam kac tane olduklarini ekranda yazdirin
		Scanner scan= new Scanner(System.in);
System.out.println("lütfen bolenleri bulmak icin pozitif bir sayý giriniz...");
	int num= scan.nextInt();
	int bolen=1;
	int sayac=0;
	while(bolen<=num) {
		if (num%bolen==0) {
			System.out.print(bolen+" ");
	sayac++;
	 }bolen++;
	}
	System.out.println("");
	System.out.println(num+ " sayisinin"+sayac+" adet tam böleni vardir.");
	scan.close();
}

}
