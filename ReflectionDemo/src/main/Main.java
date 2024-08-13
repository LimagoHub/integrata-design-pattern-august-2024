package main;

import de.tiere.Schwein;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        // 1. variante
       Class clazz = Schwein.class;

       // 2. Variante
       clazz = new Schwein().getClass();

       // 3. Variante
        clazz = Class.forName("de.tiere.Schwein");

        Object object = clazz.newInstance();
        System.out.println(object);

        Method [] methods = clazz.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }
        System.out.println("---------------------------");
        methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }

        Method method = clazz.getMethod("fuettern");
        method.invoke(object);
        System.out.println(object);

        method = clazz.getDeclaredMethod("setGewicht", int.class);
        method.setAccessible(true);
        method.invoke(object, -10);
        System.out.println(object);
    }
}