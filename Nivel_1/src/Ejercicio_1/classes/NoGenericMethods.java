package Ejercicio_1.classes;

public class NoGenericMethods<T> {

    private T object1, object2, object3;

    public NoGenericMethods(T object1, T object2, T object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public void setObject2(T object2) {
        this.object2 = object2;
    }

    public void setObject3(T object3) {
        this.object3 = object3;
    }

    public T getObject1() {
        return object1;
    }

    public T getObject2() {
        return object2;
    }

    public T getObject3() {
        return object3;
    }

    @Override
    public String toString() {
        return "object1=" + object1 +
                ", object2=" + object2 +
                ", object3=" + object3;
    }
}