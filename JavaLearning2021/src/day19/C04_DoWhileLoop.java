package day19;

public class C04_DoWhileLoop {

	public static void main(String[] args) {
		int i=0;
		
		while(i<5) {
			System.out.print(i+" ");
i++;		}
//		//while loop once kontrol eder sonra �al���r
		//loop i�inde art�� yap�lsa da bir sornaki sonuca kadar kod �al��maya devam eder.
		//bu da bazi durumlarda hatal� sonu�lara olu�mam�za sebep olabilir.
		
		//do-while loop ise once islemi yapar ve sonra �art� kontrol eder.
		//ozellikle kullan�c�dan de�er almalarda do while loop tercih edilir.
		System.out.println("");
		
		int a = 0;
		do {System.out.print(a+" ");
		a++;	} while (a<5);
	
		
		
		
	}

}
