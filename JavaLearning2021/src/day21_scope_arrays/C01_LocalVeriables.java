package day21_scope_arrays;

public class C01_LocalVeriables {

	public static void main(String[] args) {
	// local variable'lara default deger atamas� yapmaz
		//kodlar�m�zda sorun ya�amamak i�in, olu�turdu�umuz local variablelara uygun bir de�er atamam�zda 
		//fayda var
		 int sayi=0; // int sayi; dersek java CTE veriyor
	        System.out.println(sayi);
	        
	        
	        // int sayi; // bir local'de ayni isimde birden fazla variable OLUSTURULAMAZ
	        // String sayi; // data turu farkli olsa da Java buna izin vermez
	        @SuppressWarnings("unused")
			String isim="Ali";
	        
	    }
	    
	    public static void staticMethod() {
	        //sayi;     // bir local'de olusturulan variable (method'larin static olup olmamasina
	                // bagli olmaksizin)farkli local'de kullanilamaz
	        @SuppressWarnings("unused")
			String isim="Veli";
	        
	    }
	    

	}


