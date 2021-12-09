package day03;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		
Scanner scan = new Scanner (System.in);

System.out.println("Lutfen isminizi yaziniz");

String isim= scan.next();

System.out.println("isminiz:   "+isim);

scan.close();
	}

}
