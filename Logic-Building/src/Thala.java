// Check if a number is a multiple of 7 or ends with 7.
public class Thala {
    public static boolean check(int number) {
        if (number <= 0) {
            return false;
        }
        if (number % 7 == 0 || number % 10 == 7) {
            return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        System.out.println(check(7));
        System.out.println(check(49));
    }
}
