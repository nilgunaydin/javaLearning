package day26;

public class C02_ForEachLoop {

	public static void main(String[] args) {
		// Bir integer array olusturunuz ve bu array�deki
		//tum sayilarin carpimini For-each loop kullanarak bulunuz.
		//Sonucu ekrana yazdiriniz.
		
		int arr[]= {3,4,2,5};
		int carp�m=1;
		
		for (int i : arr) {
			carp�m*=i;
		}
		System.out.println("arrayin elemanlar� �arp�m� = "+carp�m);
	}

}
