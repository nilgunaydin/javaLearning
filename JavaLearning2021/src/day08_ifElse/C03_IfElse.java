package day08_ifElse;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	  System.out.println("Lütfen yaþýnýzý giriniz...");
	 int yas= scan.nextInt();
	 
	
if (yas<65) {System.out.println("emekli olamazsýn, çalýþmalýsýn");
	
} else {System.out.println("emekli olabilirsin");

}
scan.close();
	}

}
