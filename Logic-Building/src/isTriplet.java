// Take three numbers and check if they can form a Pythagorean triplet.
public class isTriplet {
    public static boolean check(int a, int b, int c) {
        if(a <= 0 || b <= 0 || c <= 0) {
            return  false;
        }
        int sqA = a * a;
        int sqB = b * b;
        int sqC = c * c;

        if(sqA + sqB == sqC) return  true;
        if(sqC + sqB == sqA) return  true;
        if(sqA + sqC == sqB) return  true;

        return  false;
    }

    public static void main(String[] args) {
        System.out.println(check(53,32,23));
        System.out.println(check(7,6,9));
    }
}
