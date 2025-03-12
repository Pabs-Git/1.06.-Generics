package Ejercicio_2.classes;

public class GenericMethods {

    public <T, Z, K> void printArgument(T obj1, Z obj2, K obj3) {

            System.out.println(obj1);
            System.out.println(obj2);
            System.out.println(obj3);
    }
}