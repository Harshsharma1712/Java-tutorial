package oops;

public class second {

    // Static method
    static void myStaticMethod() {
        System.out.println("Static method run without obj.");
    }

    // Public Method
    public void myPublicMethod() {
        System.out.println("Public method run using obj.");
    }

    public void speed(int speed) {
        System.out.println("Car is going with speed: " + speed);
    }

    public static void main(String[] args) {
        
        myStaticMethod();

        // second myStaticMethodObj = new second();

        // myStaticMethodObj.myStaticMethod();  

        // second myPublicMethodObj = new second();

        // myPublicMethodObj.myPublicMethod();

        second speed = new second();

        speed.speed(50);
    }
}
