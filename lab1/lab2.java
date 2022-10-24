import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size n: ");
        int n = in.nextInt();

        int res = 0;
        int[] arr = new int[n];
        Random randNum = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = randNum.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2 == 0) && i % 2 == 0) {
                res++;
            }
        }
        System.out.println("Count of pair el" + res);
    }
}

