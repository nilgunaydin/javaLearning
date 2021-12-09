package day10;

public class C07_SwichCase {

	public static void main(String[] args) {
//gün numarasýna göre gün isimlerini yazdýralým
		
		int dayNo= 10;
		
		switch(dayNo) {
		case 1: 
			System.out.println("Pazartesi");
			break;
		case 2: 
			System.out.println("Salý");
			break;
		case 3:
			System.out.println("Çarþamba");
			break;
		case 4:
			System.out.println("Perþembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
			default:
				System.out.println("Lütfen geçerli bir gün numarasý giriniz");
	}

}
}
