package day19;

public class C04_DoWhileLoop {

	public static void main(String[] args) {
		int i=0;
		
		while(i<5) {
			System.out.print(i+" ");
i++;		}
//		//while loop once kontrol eder sonra çalýþýr
		//loop içinde artýþ yapýlsa da bir sornaki sonuca kadar kod çalýþmaya devam eder.
		//bu da bazi durumlarda hatalý sonuçlara oluþmamýza sebep olabilir.
		
		//do-while loop ise once islemi yapar ve sonra þartý kontrol eder.
		//ozellikle kullanýcýdan deðer almalarda do while loop tercih edilir.
		System.out.println("");
		
		int a = 0;
		do {System.out.print(a+" ");
		a++;	} while (a<5);
	
		
		
		
	}

}
