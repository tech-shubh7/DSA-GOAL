public class TriangleType {
    public static String checkType(double a, double b, double c) {
        if( a <= 0 || b <= 0 || c <= 0 || (a + b  <= c) || (a + c <= b) || (b + c <= a)) {
            return "not a vaid triangle";
        }
        if(a == b && b == c) {
            return "equilateral";
        } else if ((a == b ) || (a == c ) || (b == c )) {
            return  "isosceles";
        } else {
            return "scalene";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkType(6,6,5));
        System.out.println(checkType(1,2,5));
    }
}
