package day34_accessModifier_encapsule;

public class C04_publicVeriPaylasimi {

	public static void main(String[] args) {
	C03 obj=new C03();
	System.out.println(obj.isim+" "+obj.maas);

	obj.isim="veli cem";
	obj.maas=15000;
	
	System.out.println(obj.isim+" "+obj.maas);
	}

}
