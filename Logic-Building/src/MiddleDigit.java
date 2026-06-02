// Take a 3-digit number and determine if the middle digit is the
// largest, smallest, or neither
public class MiddleDigit {
    public static String check(int number) {
        int last = number % 10;
        number = number / 10;
        int second = number % 10;
        number = number / 10;
        int first = number % 10;

        if(second >= first && second >= last) {
            return "largest";
        } else if (second <= first && second <= last) {
            return  "smallest";
        } else {
            return "neither";
        }
    }

    public static void main(String[] args) {
        System.out.println(check(102));
        System.out.println(check(552));
    }
}
