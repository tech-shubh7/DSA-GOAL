public class PrintTables {
    public static void main(String[] args) {
        int n = 8;
       for(int i = 1; i <= 10; i++) {
           String row = String.format("%d * %d = %d", n, i, n * i);
           System.out.println(row);
       }
    }
}
