public class Qtn5 {
    public static void main(String[] args) {
        int number = 123456789; // The number to count the digits for

        int evenCount = 0;
        int oddCount = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number /= 10;
        }

        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);
    }
}
