package constructor;

public class Main {

    int x;  //class attribute

    // class constructor
    public Main() {
        x = 5;
    }

    public Main(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Main myObj = new Main();

        System.out.println(myObj.x);

        Main mySecondObj = new Main(10);

        System.out.println(mySecondObj.x);
    }
}
