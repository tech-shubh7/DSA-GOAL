//  Print all numbers whose sum of digits is even (1–100).
public class FindEvenSumOfDigit {
    public static boolean isEvenSumOfDigit(int num) {
        int digit = 0;
        int sum = 0;
        while(num > 0) {
            digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 100;
        for(int i = 1; i <= n; i++) {
            if(isEvenSumOfDigit(i)) {
                System.out.print(i+ ", ");
            }
        }
    }
}

