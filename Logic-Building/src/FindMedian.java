// find median of 3 nums
public class FindMedian {
    public static int find(int a, int b, int c) {
        int temp;
        if(a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if(b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(find(43,33,32));
    }
}
