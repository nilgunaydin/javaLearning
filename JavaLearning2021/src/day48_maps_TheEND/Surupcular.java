package day48_maps_TheEND;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Surupcular {
    //Verilen listedeki Surup ilacini kullananlari list olarak döndürünüz

    public static void main(String[] args) {
        Map<Integer, String> classtangelenliste=IlacClass.ilaclar();
        String arananIlac="Surup";

        System.out.println(ilacaramamethodu(classtangelenliste, arananIlac));
    }

    private static List<String> ilacaramamethodu(Map<Integer, String> classtangelenliste, String arananIlac) {
        List<String> surupicenler = new ArrayList<String>();

        System.out.println( classtangelenliste.values());

        List<String> values=new ArrayList<>(classtangelenliste.values());

        String[] array = new String[3];
        for (String each: values) {
            array=each.split(", ");
            if (array[1].equalsIgnoreCase(arananIlac)){
                surupicenler.add(array[0]);

        }


        }


        return surupicenler;

    }



}
