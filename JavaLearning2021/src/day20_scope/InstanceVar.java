package day20_scope;

public class InstanceVar {

	int notMat =50;
	int notFen ;
	
	
	public static void main(String[] args) {
		//System.out.println(notMat);//main method static oldu�u i�in staticleri olmayan variablelar
									//main methodda direk kullan�lamaz veya g�r�nt�lenemez
		// intance variablelara main method dan ula�mak istersek obje olu�turup, obje �zerinden eri�im
		//sa�layabiliriz.				Scanner scan = new Scanner(System.in) 
									// i�inde oldu�umuz classtan bir obje olu�tural�m.
		
		InstanceVar celil= new InstanceVar();		System.out.println(celil.notMat);//50
		InstanceVar nihal= new InstanceVar();		nihal.notMat= 70;
		System.out.println(nihal.notMat);//70
		//instance variablelarda e�er de�er atamazsak o zaman java instance olarak atanan de�eri al�r
		//ama istersek de�er de atayabiliriz. bu durumda atad���m�z de�er ge�erli olur
		System.out.println(celil.notMat);//50
		
	//e�er celilin notunu de�i�tirmek istiyorsak celil.notMat a de�er atamal�y�z...
		celil.notMat=90;
		System.out.println(celil.notMat);
		celil.method2();//method2 static olmad��� i�in main methoddan direkt �a��ramaz.
	}

	public static void staticMethod() {
		
		
	}


public void method2() {
	notFen=100;
	System.out.println("method2deki notFen : "+notFen);
//instance variable olu�turulurken de�er atamasa da olur
	//bu durumlarda java default de�er atar
	//int i�in default de�er 0 d�r.

}

}
