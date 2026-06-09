public class DecimalToBinary {
    public static String binary(int num) {
        if (num <= 0) {
            return "";
        }
        int digit = num %2;
        num = num / 2;
        return "" + binary(num) + digit ;
    }

    public static void main(String[] args) {
        System.out.println(binary(8));
    }
}
