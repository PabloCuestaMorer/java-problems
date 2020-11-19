/*
 * Created by PabloCM on 19/11/2020 06:06 pm with IntelliJ IDEA
 * Project BubbleSort
 */

public class Main {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();

        String[] babyNames = {"Liam", "Olivia", "Noah", "Emma", "Oliver", "Ava", "Elijah", "Charlotte", "Mason", "Evelyn", "Pablo"};
        for (String name : bubbleSort.sortStrings(babyNames)) {
            System.out.println(name);
        }

//        int[] numbers = {4, 2, 1, 5, 3, 7, 9, 10, 6, 8},
//        for (String name : bubbleSort.sortStrings(babyNames)) {
//            System.out.println(name);
//        }

    }


}
