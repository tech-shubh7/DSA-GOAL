public class RecursionBasic {

    public static void printRecursionNum(int num) {
            if(num < 1) return;
            printRecursionNum(num - 1);
            if(num % 2 != 0) {
                System.out.println(num);
            }

    }

    public static void main(String[] args) {
        printRecursionNum(10);
    }
}
