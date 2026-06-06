public class PrintFibbonacci {

    public static void main(String[] args) {
        int n = 10;
        int first = 0;
        int second = 1;
        int sum = 1;
        System.out.println(first);
        System.out.println(second);
        for(int i = 2; i < n; i++){
           int next = first + second;
           sum += next;
            System.out.println(next);
           first = second;
           second = next;
        }
        System.out.println(sum);
    }
}
