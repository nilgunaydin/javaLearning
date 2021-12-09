package day36_inheritance;

import day35.muhasebe;

public class memur extends muhasebe {


	memur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
memur memur1=new memur();
		
	    memur1.isim="Hasan";
	    memur1.saatUcreti=16;
	    memur1.maas=memur1.maasHesapla();
	    System.out.println(memur1.isim + "'in maasi : " + memur1.maas);
	}

}
