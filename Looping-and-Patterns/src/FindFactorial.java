public class FindFactorial {
    public static int find(int num) {
        if (num <= 1) {
            return 1;
        }
        int fact = 1;
        for(int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(find(5));
    }
}
