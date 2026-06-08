public class sumOfDigits {
    public static int sum(int num) {
        if ( num <= 0) {
            return  0;
        }
        int digit = num % 10;
        num  = num / 10;
        return  digit + sum(num);
    }

    public static void main(String[] args) {
        System.out.println(sum(123));
        System.out.println(sum(432));
    }
}
