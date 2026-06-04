// check if given numbers are in arithmetic progression
public class isInArithmeticProgression {
    public static boolean check(int a, int b, int c){
        if(b - a == c - b) {
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(check(3,5,7));
        System.out.println(check(3,5,8));
    }
}
