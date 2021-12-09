package day34_accessModifier_encapsule;

public class C01acc {

	private int sayiPrivater=10;
	int sayiDefault=20;
	protected int sayiProtected=30;
	public int sayiPublic=40;
	
	public static void main(String[] args) {
	C01acc obj=new C01acc();
	System.out.println(obj.sayiPrivater);
	System.out.println(obj.sayiDefault);
	System.out.println(obj.sayiProtected);
	 System.out.println(obj.sayiPublic);
	}

}
