package oopTest;

public class Excute {
    public static void main(String[] args) {
        Main excution = new Main();

        int res = excution.x;

        System.out.println(res);

        excution.myMethod1();
        double result = excution.myMethod2(50.5, 40.5);
        System.out.println(result);
    }
}
