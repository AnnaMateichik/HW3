public class Car {
    //characteristics - fields - properties - data members
   double engine; // 8 BYTES
   int year;// 4 BYTES
   boolean electric; // 1 BYTE
   String[] color;// 8 BYTES
   String colorCode;// 8 BYTES
   String brand = "HONDA"; // 8 BYTES
   String model;   // 8 BYTES

   // behaviour - methods
//1. object non static

    public void toDrive(){
        System.out.println("Driving");
    }
    public void toStop(){

        System.out.println("Stopping");
    }
    //2. class static

    public static void fire(){
        System.out.println("Fire figthing");
    }
    public static void fire(int a){
        System.out.println("Fire figthing");
    }
    public static void fire(double b){
        System.out.println("Fire figthing");
    }
    // type + name + type parameter = signature


// constructor
//1.default constructor
    public Car (){

    }
//2.custom constructor
    public Car(int year){
        this.year = year;

    }
}
