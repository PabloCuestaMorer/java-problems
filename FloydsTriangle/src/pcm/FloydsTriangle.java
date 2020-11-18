/*
 * Created by PabloCM on 18/11/2020 12:24 pm with IntelliJ IDEA
 * Project FloydsTriangle
 */

package pcm;

public class FloydsTriangle {

    public void solution(int rows) {
        System.out.println("Floyd's triangle");
        System.out.println("------------------");
        int number = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((number++) + "\t");
            }
            System.out.println();
        }
    }
}
