package day08_ifElse;

import java.util.Scanner;

public class C02_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Lutfen bir karekter giriniz");
	        
	        char karakter=scan.next().charAt(0);
	        
	        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {
	            
	            System.out.println("girdiginiz :" + karakter + " bir harftir");
	        } else {
	            System.out.println("girdiginiz :" + karakter + " bir harf degildir");
	        }
scan.close();
	}

}
