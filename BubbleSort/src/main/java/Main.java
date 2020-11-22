/*
 * Created by PabloCM on 19/11/2020 06:06 pm with IntelliJ IDEA
 * Project BubbleSort
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        String[] names = {"Fidel", "Olivia", "Daniel", "Sebas", "Zane", "Ana", "Elijah", "Silvia", "Mason", "Pablo"};

        System.out.println("Names["+names.length+"]: ");
        for (int i = 0; i < bubbleSort.optimizeSortStrings(names).length; i++) {
            System.out.println("["+(i+1)+"] "+names[i]);
        }
    }


}
