public class FindGCD {
    public static int find(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a%b == 0) {
            return b;
        }
        while( b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(find(48,64));
    }
}
