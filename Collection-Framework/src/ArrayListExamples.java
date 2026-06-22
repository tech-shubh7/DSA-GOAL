import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {
        // store only even nums in list
        int[] input = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> evens = new ArrayList<>();

        for(int num : input) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        System.out.println(evens);


        // you have given array list with user ids find if particular userid exists in list or not
        ArrayList<Integer> userIds = new ArrayList<>();
        userIds.add(123);
        userIds.add(312);
        userIds.add(423);
        userIds.add(876);
        userIds.add(677);

        int target = 876;
        int foundIndex = -1;
        for(int i = 0; i < userIds.size(); i++) {
            if(userIds.get(i) == target) {
                foundIndex =  i;
                break;
            }
        }
        System.out.println("Target found at index: " + foundIndex);

        // find max temp from given list of temps
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(39);
        temp.add(36);
        temp.add(49);
        temp.add(46);
        temp.add(43);
        temp.add(33);
        temp.add(22);

        int max = temp.get(0);
        for(int i = 0; i < temp.size(); i++) {
            if(temp.get(i) > max) {
                max = temp.get(i);
            }
        }
        System.out.println("Max temp = "+ max);

        // store wants to apply 10 % taxes on prices apply for each value in list
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(34.67);
        prices.add(74.35);
        prices.add(534.341);
        prices.add(5325.42);

        for (int i = 0; i < prices.size(); i++) {
            double updatedPrice = prices.get(i) * 1.10;
            prices.set(i, updatedPrice);
        }

        System.out.println("Updated prices = " + prices);

        // implement stack like structure
        ArrayList<String> actions = new ArrayList<>();
        actions.add("color");
        actions.add("water");
        actions.add("food");

        System.out.println("Current actions: "+ actions);

        while (!actions.isEmpty()) {
            int lastIndex = actions.size() - 1;
            String removedAction = actions.remove(lastIndex);

            System.out.println("Undone : "+ removedAction);
        }
        System.out.println("Final list size: "+actions.size());
     }
}

