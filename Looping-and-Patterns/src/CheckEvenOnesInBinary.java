// Print all numbers from 1–n whose binary representation has an even number of 1s.
public class CheckEvenOnesInBinary {
    public static boolean check(int num) {
        int digit = 0;
        int count = 0;
        while (num > 0) {
            if(num % 2 == 1) {
                count++;
            }
            num = num / 2;
        }
        return count % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 100;
        for(int i = 1; i <= n; i++) {
            if(check(i)) {
                System.out.println(i+",");
            }
        }
    }
}
