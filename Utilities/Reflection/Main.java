package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Bob", 4);
        Class<Dog> dogClass = Dog.class;
        System.out.println(dogClass.getName());
        System.out.println(dogClass.getSimpleName());

        Constructor[] constructors = dogClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            System.out.println("-----params---------");
            if (constructor.getParameterCount() == 0) {
                System.out.println("no arg constructor");
            } else {
                Parameter[] parameters = constructor.getParameters();
                for (Parameter parameter : parameters) {
                    System.out.println(parameter.getName() + " " + parameter.getType());
                }
            }
        }

        Method[] methods = dogClass.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println("Method #" + (i) + " " + Modifier.toString(methods[i].getModifiers()) + " " + methods[i].getReturnType().getName() + " " + methods[i].getName() + " " + Arrays.toString(methods[i].getParameters()));
        }
        System.out.println("\n--------Declared Methods Only----------\n");

        Method[] declaredMethods = dogClass.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            System.out.println("Methods #" + (i) + " " + Modifier.toString(declaredMethods[i].getModifiers()) + " " + declaredMethods[i].getReturnType().getName() + " " + declaredMethods[i].getName() + " " + Arrays.toString(declaredMethods[i].getParameters()));
        }
    }
}
