import java.util.Scanner;

class lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a, b, c;
        double D;

        System.out.print("Input a: ");
        a = in.nextDouble();

        System.out.print("Input b: ");
        b = in.nextDouble();

        System.out.print("Input c: ");
        c = in.nextDouble();

        D = b * b - 4 * a * c;

        if (D > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Single Root: x = " + x);
        } else {
            System.out.println("No Roots");
        }
    }
}
