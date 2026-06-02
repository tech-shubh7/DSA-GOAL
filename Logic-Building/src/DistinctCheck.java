
public class DistinctCheck {
    public static Boolean check(int number) {
        int[] nums = new int[10];
        int currentDigit;
        while(number > 0) {
            currentDigit = number % 10;
            number = number / 10;

            if(nums[currentDigit] == 1) {
                return  false;
            } else {
                nums[currentDigit] = 1;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        System.out.println(check(123));
        System.out.println(check(121));
    }
}
