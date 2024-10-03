package arrays;

public class first {
    public static void main(String[] args) {
        // data_type[] arrayName = {values,}

        // String[] cars = {"car1", "car2",};

        int[] intArray = {10, 20, 30, 40, 50};

        // System.out.println(intArray[1]);
        // System.out.println(intArray[4]);

        // intArray[3] = 99;
        // System.out.println(intArray[3]);

        // System.out.println(intArray.length);

        // for(int i = 0; i < intArray.length; i++) {
        //     System.out.println(intArray[i]);
        // }

        for(int i: intArray) {
            System.out.println(i);
        }
    }
}
