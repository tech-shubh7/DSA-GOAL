import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (count < 5) {
            System.out.print("Enter a number for sum : ");
            int num = sc.nextInt();
            if(num != 0) {
                sum += num;
            }
            count++;
        }
        System.out.println(sum);
    }
}
