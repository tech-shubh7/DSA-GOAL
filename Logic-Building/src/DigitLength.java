// Check whether a given integer is single-digit, double-digit, or multi-digit.

public class DigitLength {
    public static String getDigitLength(int number) {

        if(number == 0) {
            return "single digit";
        }
        number = Math.abs(number);
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        if (count == 1) {
            return "single-digit";
        } else if (count == 2) {
            return "double-digit";
        } else {
            return "multi-digit";
        }
    }

    public static void main(String[] args) {
        System.out.println(getDigitLength(0));
    }
}

