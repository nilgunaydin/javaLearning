package day35;

public class muhasebe extends Personel {
  protected muhasebe(){
	  super(5);
  };
	protected int saatUcreti;
	protected String statu;
	protected int maas;

	public static void main(String[] args) {
		
		muhasebe clsn1=new muhasebe();
		 
		clsn1.isim="Ali";
		System.out.println(clsn1.soyisim); // null
	
		

	}
	
	
	public int maasHesapla() {
		
		int maas= 8*25*saatUcreti;
		
		return maas;

	}

}
