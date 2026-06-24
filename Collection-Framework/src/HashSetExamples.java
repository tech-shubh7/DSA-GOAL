import java.util.HashMap;
import java.util.HashSet;

public class HashSetExamples {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();

        nums.add(3);
        nums.add(7);
        nums.add(6);
        nums.add(33);

        System.out.println(nums);

        HashMap<String, Integer> products = new HashMap<>();

        products.put("p1", 65);
        products.put("p2", 32);
        products.put("p3", 77);

        System.out.println(products);

        int[] scanned = {101, 204, 305, 101, 402};

        HashSet<Integer> numbers = new HashSet<>();

        for(int num: scanned) {
            if(numbers.contains(num)) {
                System.out.println("Alram! Duplicate token found: "+ num);
            }
            numbers.add(num);
        }

        String[] fruits = {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};

        HashMap<String, Integer> count = new HashMap<>();

        for(String fruit: fruits) {
            if(count.containsKey(fruit)) {
                count.computeIfPresent(fruit, (key, value) -> value+1);
            } else  {
                count.put(fruit, 1);
            }
        }
        System.out.println(count);
    }
}
