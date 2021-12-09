package day34_accessDeneme;

import day34_accessModifier_encapsule.C01acc;

public class C01_BaskaPackage {

	public static void main(String[] args) {
		C01acc obj=new C01acc();
		/*
		  System.out.println(obj.sayiPrivate); 
		  System.out.println(obj.sayiDefault);
		 System.out.println( obj.sayiProtected);
		 */		
		System.out.println(obj.sayiPublic);

	}

}
