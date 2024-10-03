package methods;

public class second {

    static void myMethod(String fname) {
        System.out.println("You pass the name: " + fname);
    }

    static void mySecondMethod(String fname, int age) {
        System.out.println("fName is: " + fname + " Age is: " + age);
    }

    public static void main(String[] args) {
        myMethod("Harsh");
        myMethod("Ajay");
        myMethod("");

        mySecondMethod("Preeti", 24);
    }
}
