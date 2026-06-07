import java.util.Arrays;

//Find the smallest and largest digit in a given number.
public class FindSmallestLargestDigit {
    public static int[] find(int nums) {
        int digit = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        while(nums > 0) {
            digit = nums % 10;
            nums = nums / 10;
            if(digit > largest) {
                largest = digit;
            }
            if(digit < smallest) {
                smallest = digit;
            }
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(534)));
        System.out.println(Arrays.toString(find(972)));
    }
}
