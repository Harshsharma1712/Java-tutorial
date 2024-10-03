package constructor;

public class First {

    int modelYear;
    String modelName;

    public First(int year,  String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        First myCar = new First(1998, "Mustang");

        System.out.println("Car is " + myCar.modelName + " Year is " + myCar.modelYear);

    } 
}
