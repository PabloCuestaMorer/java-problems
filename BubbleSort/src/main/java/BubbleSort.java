/*
 * Created by PabloCM on 19/11/2020 06:07 pm with IntelliJ IDEA
 * Project BubbleSort
 */

public class BubbleSort {

    public String[] sortStrings(String[] words) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].compareToIgnoreCase(words[i + 1]) > 0) {
                    String aux = words[i + 1];
                    words[i + 1] = words[i];
                    words[i] = aux;
                    sorted = false;
                }
            }
        }
        return words;
    }

    public String[] optimizeSortStrings(String[] words) {
        boolean swap = false;
        for (int i = 0; i < words.length - 1; i++) {
            swap = false;
            for (int j = 0; j < (words.length - 1) - i; j++) {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    String aux = words[j + 1];
                    words[j + 1] = words[j];
                    words[j] = aux;
                    swap = true;
                }
            }
            //If no two elements were swapped by inner loop, then break.
            if (swap == false) {
                break;
            }
        }
        return words;
    }
}
