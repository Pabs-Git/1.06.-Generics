package Ejercicio_2.main;

import Ejercicio_2.classes.GenericMethods;
import Ejercicio_2.classes.Person;

public class Main {

    public static void main(String[] args) {

        GenericMethods genericMethods = new GenericMethods();

        Person person = new Person("Paco", "Paquito", 52);
        Person person2 = new Person("Paquito", "Paco", 25);

        genericMethods.printArgument(person, "Hola", 1999);
        System.out.println();
        genericMethods.printArgument("Hola", "mundo", 2025);
        System.out.println();
        genericMethods.printArgument(person, person2, 1990);

    }
}
