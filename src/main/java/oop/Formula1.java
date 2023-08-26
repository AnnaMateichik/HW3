package oop;

public class Formula1 extends SportCar implements Movable,Saleable{
    private double length;

    @Override
    public void sendSOS() {
        System.out.println("Sending SOS signal from Formula");


    }
}
