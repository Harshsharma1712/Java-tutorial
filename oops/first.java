package oops;

public class first {

    int x = 10;
    int y = 20;
    
    String name = "Harsh";
    int age = 19;


    public static void main(String[] args) {
        // first myobj = new first();
        // System.out.println(myobj.x);

        first mySecondObj = new first();

        mySecondObj.y = 50;

        // System.out.println(mySecondObj.y);

        // first mySecondObj2 = new first();

        // System.out.println(mySecondObj2.y);

        first bioData = new first();

        System.out.println("My name is " + bioData.name + " and my age is " + bioData.age);
    }
}
