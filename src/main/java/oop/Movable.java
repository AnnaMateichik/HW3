package oop;

public interface Movable {
    double length = 3.5;

    void sendSOS();

    static void anyMethod() {
        System.out.println("Any Method");
    }

    default void otherMethod() {
        System.out.println("Other method");
    }
}
