//Check if a number is an Armstrong number.
public class CheckArmstrong {
    public static boolean check(int num) {
        int n = String.valueOf(Math.abs(num)).length();
        int original = num;
        int digit = 0;
        int sum = 0;
        while (num > 0){
            digit = num % 10;
            sum += Math.pow(digit, n);
            num = num / 10;
        }
        return original == sum;
    }

    public static void main(String[] args) {
        System.out.println(check(153));
        System.out.println(check(154));
    }
}
