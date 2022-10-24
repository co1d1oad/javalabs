import java.util.Scanner;

public class lab3 {

    public static void makeSquare(int s) {

        int magicSqr[][] = new int[s][s];
        int r = s / 2;
        int c = s - 1;
        for (int no = 1; no <= s * s;) {
            if (r == -1 && c == s) {
                c = s - 2;
                r = 0;
            } else {
                if (c == s) {
                    c = 0;
                }
                if (r < 0) {
                    r = s - 1;
                }
            }
            if (magicSqr[r][c] != 0) {
                c = c - 2;
                r = r + 1;
                continue;
            } else {
                magicSqr[r][c] = no;
                no = no + 1;
            }
            c = c + 1;
            r = r - 1;
        }
        System.out.print("The Magic Square for " + s + ": \n");
        System.out.print("Sum of each column or row " + s * (s * s + 1) / 2 + ": \n");
        for (r = 0; r < s; r++) {
            for (c = 0; c < s; c++) {
                System.out.print(magicSqr[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size n: ");
        int n = in.nextInt();
        makeSquare(n);
    }
}
