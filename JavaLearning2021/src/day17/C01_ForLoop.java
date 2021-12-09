package day17;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// interview
		
Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen 100 den küçük bir sayý yazýnýz");
		
		int num= scan.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i%5==0 && i%3==0) {System.out.println("java güzeldir");
				
			} else if(i%5==0) {System.out.println("güzeldir");

			}else if(i%3==0){System.out.println("java");
				
			}else {System.out.println(i);}
		}
		scan.close();
	}

}
