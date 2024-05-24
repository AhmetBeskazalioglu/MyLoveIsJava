package javamodules.generics;

public class Generics_Test {

    public static <E> void yazdir(E[] dizi){
        for(E e : dizi){
            System.out.println(e);
        }
    }

    public static <E> E yazdir2(E[] dizi){
        for(E e : dizi){
            System.out.println(e);
        }
        return dizi[0];

    }

    public static void objeyi_yazdir(Object[] dizi){
        for(Object o : dizi){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Integer[] int_dizi = {1,2,3,4,5};
        String[] string_dizi = {"Java","Python","C++","Php"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Ahmet"),new Ogrenci("Mehmet")};

        yazdir(int_dizi);
        yazdir(string_dizi);
        yazdir(ogrenci_dizi);
        System.out.println("*************************");
        objeyi_yazdir(int_dizi);
        objeyi_yazdir(string_dizi);
        objeyi_yazdir(ogrenci_dizi);
        System.out.println("*************************");
        System.out.println(yazdir2(int_dizi));
        System.out.println(yazdir2(string_dizi));
        System.out.println(yazdir2(ogrenci_dizi));
        System.out.println("*************************");
        if (yazdir2(int_dizi) instanceof Integer i){
            System.out.println(i+" Integer");
        } else if (yazdir2(string_dizi) instanceof String s){
            System.out.println(s+" nın uzunluğu: "+s.length());
        } else if (yazdir2(ogrenci_dizi) instanceof Ogrenci o){
            System.out.println(o.getIsim()+" Öğrencisinin ismi");
        }
    }
}
