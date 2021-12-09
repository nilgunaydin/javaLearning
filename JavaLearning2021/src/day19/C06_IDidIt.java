package day19;

import java.util.Scanner;

public class C06_IDidIt {

	public static void main(String[] args) {
		// Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
//		 Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
//		 - Sifre kucuk harf icermelidir
//		 - Sifre buyuk harf icermelidir
//		 - Sifre ozel karakter icermelidir
//		 - Sifre en az 8 karakter olmalidir.
		
		        
		        Scanner scan= new Scanner(System.in);
		        String sifre="";
		        boolean khk=false;
		        boolean bhk=false;
		        boolean okk=false;
		        boolean uk=false;
		        do {
		            System.out.println("Lutfen bir sifre giriniz");
		            sifre = scan.nextLine(); 
		            
		            khk=kucukHarfKontrol(sifre);
		            bhk= buyukHarfKontrol(sifre);
		            okk= ozelKarakterKontrol(sifre);
		            uk=uzunlukKontrolu(sifre);
		            
		        }while(!khk || !bhk || !okk || !uk);
		        
		        System.out.println("sifreniz basarili bir sekilde kaydedildi");
		        
		        scan.close();
		    }
		    private static boolean uzunlukKontrolu(String sifre) {
		        boolean uk=false;
		        if (sifre.length()>=8) {
		            uk=true;
		        } else {
		            System.out.println("sifreniz en az 8 karakter olmalidir");
		        }
		        return uk;
		    }
		    private static boolean ozelKarakterKontrol(String sifre) {
		        boolean okk=true;
		        
		        if(sifre.equals(sifre.replaceAll( "\\W","")));
		        {okk= false	;
		        	System.out.println("Sifre ozel karakter icermelidir ");
				}
			return okk;
	
			}
		      
		       
		    
		    private static boolean buyukHarfKontrol(String sifre) {
		        boolean bhk=true;
		        if (sifre.equals(sifre.toLowerCase())) {
		        	bhk=false;
		        	System.out.println("sifre en az bir büyük harf içermeli");
		                   
		  return bhk;  }
		        
		        if (!bhk) {
		            System.out.println("Sifreniz en az bir buyuk harf icermelidir");
		        }
		        
		        return bhk;
		    }
		    private static boolean kucukHarfKontrol(String sifre) {
		        boolean khk=true;
		        if(sifre.equals(sifre.toUpperCase())) {
		            System.out.println("Sifreniz en az bir kucuk harf icermelidir");
		        khk =false;
		        }
		        return khk;
		    }
	
	
	}

