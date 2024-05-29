package javamodules.reflection;

import java.lang.reflect.Method;

public class Reflection_Test {

    public static void main(String[] args) {

        try {
            Class<?> clss = Class.forName("javamodules.reflection.Deneme");
            Object obj = clss.getDeclaredConstructor().newInstance();
            Method[] methods = clss.getMethods();
            for (Method method : methods) {
                System.out.println("Method Name: " + method.getName());
            }
            Method method = clss.getMethod("goster");
            method.invoke(obj);
            Method method1 = clss.getMethod("goster", String.class);
            method1.invoke(obj, "Temp");
            Method method2 = clss.getMethod("goster", int.class);
            method2.invoke(obj, 5);
            Method method3 = clss.getMethod("setAd", String.class);
            method3.invoke(obj, "Ali");
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
