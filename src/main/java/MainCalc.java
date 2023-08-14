public class MainCalc {
    public static void main(String[] args) {
        int[] ar = {3, 7, 6};
        System.out.println(ar);
        System.out.println(ar[1]);
        Car c = new Car();
        System.out.println(c);
        System.out.println(c.brand);
        c.toDrive();
        Car.fire();

        Car c1 = new Car(2020);
        System.out.println(c1.year);

    }
}
/*


                                 Stack
 Car c <------------------------reference -----------{ engine = 0.0
                                                         year = 0
                                                         electric = false
                                                         colors = null
                                                         colorCode = 0
                                                         brand = HONDA
                                                         model = null
                                                           }
Car c1 <------------------------reference -----------{ engine = 0.0
                                                         year = 2020
                                                         electric = false
                                                         colors = null
                                                         colorCode = 0
                                                         brand = HONDA
                                                         model = null
                                                           }




 */