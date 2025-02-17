package Ejercicio_2.classes;

public class GenericMethods {

    public <T> void printArgument(T argument) {

            Person person = (Person) argument;
            System.out.println("Name: " + person.getName());
            System.out.println("Surname: " + person.getSurname());
            System.out.println("Age: " + person.getAge());

    }
}