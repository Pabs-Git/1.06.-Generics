package Ejercicio_1.main;

import Ejercicio_1.classes.NoGenericMethods;

public class Main {

    public static void main(String[] args) {

        NoGenericMethods<String> order1 = new NoGenericMethods<>("Hola", "Mundo", "Java");
        NoGenericMethods<String> order2 = new NoGenericMethods<>("Mundo", "Java","Hola");
        NoGenericMethods<String> order3 = new NoGenericMethods<>("Java", "Hola", "Mundo");

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
    }
}
