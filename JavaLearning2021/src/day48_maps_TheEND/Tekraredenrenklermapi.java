package day48_maps_TheEND;
import java.util.*;
import java.util.Map.Entry;

public class Tekraredenrenklermapi {
    public static void main(String[] args) {

        Map<String, ArrayList> multiMap= new HashMap<String, ArrayList>();
        ArrayList list1=new ArrayList();
        list1.add("Sari");
        list1.add("Siyah");
        list1.add("Somon");

        ArrayList list2=new ArrayList();
        list2.add("Mavi");
        list2.add("Mor");

        multiMap.put("S ile baslayan renkler",list1);
        multiMap.put("M ile baslayan renkler",list2);
        System.out.println(multiMap);

        Set<Entry<String, ArrayList>>setMap=multiMap.entrySet();
        Iterator<Entry<String, ArrayList>> iteratorMap=setMap.iterator();
         //Burdan itibaren birlestirmeye basliyorum
        while(iteratorMap.hasNext()){
             Map.Entry<String, ArrayList> entry=( Map.Entry<String, ArrayList>) iteratorMap.next();
             String key=entry.getKey();
             List values = entry.getValue();
            System.out.println( key + " su degerlere sahiptir " + values);

         }

    }
}
