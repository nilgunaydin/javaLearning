package day10;

public class C07_SwichCase {

	public static void main(String[] args) {
//g�n numaras�na g�re g�n isimlerini yazd�ral�m
		
		int dayNo= 10;
		
		switch(dayNo) {
		case 1: 
			System.out.println("Pazartesi");
			break;
		case 2: 
			System.out.println("Sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("Per�embe");
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
				System.out.println("L�tfen ge�erli bir g�n numaras� giriniz");
	}

}
}
