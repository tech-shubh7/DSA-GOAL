public class isInGeometricProgression {
    public static boolean check(int a, int b, int c) {
      return  (long) b * b == (long) a*c;
    }

    public static void main(String[] args) {
        System.out.println(check(2,4,6));
        System.out.println(check(2,4,8));
    }
}
