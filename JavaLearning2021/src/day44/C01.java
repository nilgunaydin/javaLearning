package day44;

import java.util.ArrayList;
import java.util.List;

public class C01 {

	public static void main(String[] args) {
	
			List <Integer> liste = new ArrayList<>();
				
				liste.add(5);
				liste.add(3);
				liste.add(7);
				liste.add(1);
				liste.add(9);
				liste.add(8);
				liste.add(2);
				
				System.out.println(liste);
				
				// index kullanmadan tum elemanlari 3 eklenmis olarak yazdirin
				for (int i = 0; i<liste.size();i++) {
					liste.set(i, liste.get(i)+3);
					
					
				}	 // 8 6 10 4 12 11 5 	
				
				System.out.println(liste);


				
			}

		
	}


