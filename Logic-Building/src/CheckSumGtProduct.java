// Take an integer (1–9999) and check if the sum of its digits is greater than the product
//of its digits
public class CheckSumGtProduct {
    public static boolean check(int num) {
        if (num < 1 ||num > 9999) {
            return false;
        }
        int digit;
        int sum = 0;
        int product = 1;
        while (num != 0) {
            digit = num % 10;
            sum += digit;
            product *= digit;
            num = num/10;
        }
        return sum > product;
    }

    public static void main(String[] args) {
        System.out.println(check(990));
        System.out.println(check(991));
        System.out.println(check(1111));
    }
}
