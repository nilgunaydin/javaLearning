package day38_overriding;

public class Fishs extends Animals {

	public static void main(String[] args) {	
	Fishs balik1=new Fishs();
	
	balik1.beslenme();   //Tum hayvanlar beslenir
	
	balik1.hareket();    //Baliklar yuzerek hareket eder
	
	balik1.solunum(); //Baliklar solungaclariyla nefes alir
	}
	public void hareket() {
        System.out.println("Baliklar yuzerek hareket eder");
    }
    
    
    public void solunum() {
        System.out.println("Baliklar solungaclariyla nefes alir");
    }
}
