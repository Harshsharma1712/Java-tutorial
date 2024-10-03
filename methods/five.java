package methods;

public class five {
    public static void main(String[] args) {

        /*
         * {...} -> Scope
         */

        {
            int x = 10;

            System.out.println(x);
        }
 
        int x = 50;
        System.out.println(x);
    }
}
