public class PrintFibbonacci {
    public static void main(String[] args) {
        int n =10;
        int st = 0;
        int sts = 1;
        for(int i = 1; i <= n; i++){
            System.out.println(st);
            System.out.println(sts);
            st = sts;
            sts = i + sts;
        }
    }
}
