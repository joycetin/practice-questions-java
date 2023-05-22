
public class Qtn1 {
    public static void main(String[] args) {
        int first = 1;
        int second = 2;

        System.out.println("Before:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);

        // Swapping the numbers
        int store = first;
        first = second;
        second = store;

        System.out.println("After:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
    }
}

