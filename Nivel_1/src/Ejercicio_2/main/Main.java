package Ejercicio_2.main;

import Ejercicio_2.classes.GenericMethods;
import Ejercicio_2.classes.Person;

public class Main {

    public static void main(String[] args) {

        GenericMethods genericMethods = new GenericMethods();

        Person person = new Person("Paco", "Paquito", 52);

        genericMethods.printArgument(person);

    }
}
