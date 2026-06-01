public class ValidTriangle {
    public static boolean isValidTriangle(double a, double b, double c) {
        if(a <= 0 || b<= 0 || c <= 0) {
            return  false;
        }
        return (a+b > c) && (b+c > a) && (a+c > b);
    }

    public static void main(String[] args) {
        boolean bl = isValidTriangle(6,6,5);
        System.out.println(bl);
        System.out.println(isValidTriangle(532,322,532));
        System.out.println(isValidTriangle(1,2,10));
    }
}
