package javamodules.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Calisan {
    public String Ad;
    public String Soyad;
    public String TcKimlikNo;
    public double MaasHesap(double saat, double saatlikUcret) {
        return saat * saatlikUcret;
    }
}

public class Reflection {
    public static void main(String[] args) {
        Calisan calisan = new Calisan();
        Class<?> clazz = calisan.getClass();
        System.out.println("Class Name: " + clazz.getName());
        System.out.println("Simple Name: " + clazz.getSimpleName());
        System.out.println("Package: " + clazz.getPackage());

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("Method Name: " + method.getName());
        }

        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println("Field Name: " + field.getName());
        }
    }
}
