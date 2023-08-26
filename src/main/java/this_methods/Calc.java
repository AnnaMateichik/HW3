package this_methods;

public class Calc {
    //characteristics - fields - properties - data members
    int a;
    int b;
    static int res;

    public static void printRes() {
        System.out.println("Result = " + res);

    }

    public void calculate(int a, int b, char action) {
        switch (action) {
            case '+':
                res = this.a + this.b;
                break;
            case '-':
                res = a - b;
                break;


        }
//        return res; - > if it was "int"
    }

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
