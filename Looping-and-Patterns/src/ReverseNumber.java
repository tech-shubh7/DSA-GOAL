public class ReverseNumber {
    public static int reverse(int num){
        int reversed = 0;
        int digit;
        while (num != 0){
            digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
    }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(321));
        System.out.println(reverse(765));
    }
}
