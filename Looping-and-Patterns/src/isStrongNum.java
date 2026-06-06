public class isStrongNum {
    public static int findFactorial(int num) {
        if(num <= 1) {
            return 1;
        }
        return num*findFactorial(num-1);
    }
    public static boolean isStrong(int num) {
        int originalNum = num;
        int digit = 0;
        int sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum += findFactorial(digit);
            num = num/10;
        }
        return originalNum == sum;
    }
    public static void main(String[] args) {
        System.out.println(isStrong(145));
    }
}
