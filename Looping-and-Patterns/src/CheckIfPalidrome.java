public class CheckIfPalidrome {
    public static boolean check(int num) {
        int originalNum = num;
        int reversed = 0;
        int digit;
        while (num != 0) {
            digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return originalNum == reversed;
    }

    public static void main(String[] args) {
        System.out.println(check(121));
        System.out.println(check(454));
        System.out.println(check(4532));
    }
}
