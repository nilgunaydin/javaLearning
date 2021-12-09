package day07_basicIfSentences;

import java.util.Scanner;

public class C01_BasicIf {

	public static void main(String[] args) {
	
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birinin ilk harfini yaziniz");
        // Kullanicinin girdigi verinin tamamini kucuk harf veya buyuk harf yapabiliriz
        // scan.next() ten sonra toUpperCase yazarsak kelimeyi buyuk harfe
        // toLowercase yazarsak kelimenin tan=mamini kucuk harfe cevirmis oluruz
        
        char ilkHarf=scan.next().toUpperCase().charAt(0);
        
        
        if (ilkHarf=='P') {
            System.out.println("Pazar, Pazartesi veya Persembe");
        }
        if (ilkHarf=='S') {
            System.out.println("Sali");
        }
        if (ilkHarf=='C') {
            System.out.println("Carsamba, Cuma veya Cumartesi");
        }
        
        if (ilkHarf!='C' & ilkHarf!='P' & ilkHarf!='S') {
            System.out.println("Gecersiz harf girdiniz .Lutfen gun isimlerinden birinin basharfini yazin");
        }
   scan.close();
   
	}
	}

