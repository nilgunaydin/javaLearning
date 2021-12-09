package day20_scope;

public class InstanceVar {

	int notMat =50;
	int notFen ;
	
	
	public static void main(String[] args) {
		//System.out.println(notMat);//main method static olduðu için staticleri olmayan variablelar
									//main methodda direk kullanýlamaz veya görüntülenemez
		// intance variablelara main method dan ulaþmak istersek obje oluþturup, obje üzerinden eriþim
		//saðlayabiliriz.				Scanner scan = new Scanner(System.in) 
									// içinde olduðumuz classtan bir obje oluþturalým.
		
		InstanceVar celil= new InstanceVar();		System.out.println(celil.notMat);//50
		InstanceVar nihal= new InstanceVar();		nihal.notMat= 70;
		System.out.println(nihal.notMat);//70
		//instance variablelarda eðer deðer atamazsak o zaman java instance olarak atanan deðeri alýr
		//ama istersek deðer de atayabiliriz. bu durumda atadýðýmýz deðer geçerli olur
		System.out.println(celil.notMat);//50
		
	//eðer celilin notunu deðiþtirmek istiyorsak celil.notMat a deðer atamalýyýz...
		celil.notMat=90;
		System.out.println(celil.notMat);
		celil.method2();//method2 static olmadýðý için main methoddan direkt çaðýramaz.
	}

	public static void staticMethod() {
		
		
	}


public void method2() {
	notFen=100;
	System.out.println("method2deki notFen : "+notFen);
//instance variable oluþturulurken deðer atamasa da olur
	//bu durumlarda java default deðer atar
	//int için default deðer 0 dýr.

}

}
