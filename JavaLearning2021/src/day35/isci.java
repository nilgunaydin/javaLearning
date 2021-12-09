package day35;

public class isci extends muhasebe {

	protected String statu;
	protected String meslegi;
	protected String Sendika;

	public static void main(String[] args) {
		
		isci isci1=new isci();
		isci1.meslegi="Kaynakci";
		isci1.saatUcreti=20;
		isci1.isim="Emine";
		isci1.maas=isci1.maasHesapla();
		System.out.println(isci1.isim +"'in maasi : " + isci1.maas);

		

	}

}
