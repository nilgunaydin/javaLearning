package day17;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// interview
		
Scanner scan= new Scanner(System.in);
		
		System.out.println("l�tfen 100 den k���k bir say� yaz�n�z");
		
		int num= scan.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i%5==0 && i%3==0) {System.out.println("java g�zeldir");
				
			} else if(i%5==0) {System.out.println("g�zeldir");

			}else if(i%3==0){System.out.println("java");
				
			}else {System.out.println(i);}
		}
		scan.close();
	}

}
