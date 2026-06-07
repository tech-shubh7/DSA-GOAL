public class IsPalidrome {
    public static boolean checkPalidrome(int num) {
        int original = num;
        int reversed = 0;
        int digit = 0;
        while(num > 0) {
            digit = num % 10;
            reversed = reversed*10 + digit;
            num = num / 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(checkPalidrome(121));
        System.out.println(checkPalidrome(1441));
    }
}
