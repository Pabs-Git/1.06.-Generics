package Ejercicio_1.main;

import Ejercicio_1.classes.NoGenericMethods;

public class Main {

    public static void main(String[] args) {

        NoGenericMethods<String> strings = new NoGenericMethods<>("Hola", "Mundo", "Java");
        NoGenericMethods<Integer> integers = new NoGenericMethods<>(1, 2, 3);
        NoGenericMethods<String> differentOrder = new NoGenericMethods<>("Java", "Hola", "Mundo");

        System.out.println(strings);
        System.out.println(integers);
        System.out.println(differentOrder);
    }
}
