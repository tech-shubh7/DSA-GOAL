public class revNumber {
    public static int reverse(int num, int reversed) {
        if (num <= 0) {
            return reversed;
        }
        int digit = num % 10;
        int updatedReversed = (reversed * 10) + digit;
        return reverse(num/10, updatedReversed);
    }
    public static boolean checkPalidrome(int num) {
        return  reverse(num,0) == num;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1234, 0));
        System.out.println(checkPalidrome(1211));
    }
}
