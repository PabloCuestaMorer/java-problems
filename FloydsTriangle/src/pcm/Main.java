package pcm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows which you want in your Floyd Triangle: ");
        int rows = scanner.nextInt();

        FloydsTriangle floydsTriangle = new FloydsTriangle();
        floydsTriangle.solution(rows);
    }
}
