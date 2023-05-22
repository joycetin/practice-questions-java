public class Qtn4 {
    public static void main(String[] args) {
        int num = 788551782; // The number for which we want to count the digits

        int digitCount = countDigits(num);
        System.out.println("The number of digits in " + num + " is: " + digitCount);
    }

    public static int countDigits(int num) {
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}

