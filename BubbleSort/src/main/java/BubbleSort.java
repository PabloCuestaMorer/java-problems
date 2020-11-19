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

}
