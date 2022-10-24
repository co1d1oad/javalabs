package lab2;

import java.util.Scanner;

public class lab2 {

    public static int[][] magic() {
        int num = -1, i, j;
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println("Elements of the matrix are");
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        Scanner in = null;
        boolean restart = false;
        in = new Scanner(System.in);
        do {
            restart = false;
            try {
                System.out.println("Input col number:");
                num = in.nextInt();
            } catch (Exception e) {
                System.out.println("цілі числа!");
                restart = true;
                in.nextLine();
            }
            if (num >= matrix[0].length || num < 0) {
                System.out.println("ВВедіть від 0 до " + (matrix[0].length - 1));
                restart = true;
            }
        } while (restart);
        in.close();
        System.out.println("Your column");
        for (i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][num] + " ");
            System.out.println();
        }
        return matrix;

    }

    public static void main(String[] args) {
        magic();
    }
}