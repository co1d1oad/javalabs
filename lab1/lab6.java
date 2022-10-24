import java.util.Arrays;

class lab6 {

    static boolean isBinary(int number) {
        int copyOfInput = number;

        while (copyOfInput != 0) {
            if (copyOfInput % 10 > 1 || (copyOfInput < 10 && copyOfInput > 1) || copyOfInput < 0) {
                return false;
            }
            copyOfInput = copyOfInput / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "dgvd101 shgdfhmhfgh78gfsbgszd1001101001dhnbf0grfed";
        String str = sentence.replaceAll("[^-?0-9]+", " ");
        System.out.println("str "+str);
        String[] array = str.trim().split(" ");
        System.out.println("Array " + Arrays.asList(array));


        for (int i = 0; i < array.length; i++) {
            if (isBinary(Integer.parseInt(array[i]))) {
                System.out.println(array[i] + " is binary, decimal value is: " + Integer.parseInt(array[i], 2));
            }
        }
    }

}

