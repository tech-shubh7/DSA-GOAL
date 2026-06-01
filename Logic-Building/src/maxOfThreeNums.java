public class maxOfThreeNums {
    public static int maxOfThreeNum(int a, int b, int c) {

        if(a > b) {
            if(a > c) {
                return  a;
            } else  {
                return c;
            }
        } else {
            if(b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
    public static void main(String[] args) {
        int max = maxOfThreeNum(3,33,7);
        System.out.println(max);
    }
}
