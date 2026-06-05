public class CheckPerfectNum {
    public static boolean check(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1;
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(check(6));
        System.out.println(check(28));
    }
}
