/**
 * @author: MARK ANDREW DUZA
 *          BSIT 103
 */

public class App {

    /**
     * static variables that can be used within class file
     */
    static int height = 5; // column

    static int width = (2 * height) - 1; // row

    // static method to find absolute value of "a"
    static int absoluteVal(int a) {
        return a < 0 ? -1 * a : a;
    }

    // "M"
    static void charM() {
        int i, j, counter = 0;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j <= height; j++) {
                if (j == height)
                    System.out.printf("*");
                else if (j == counter || j == height - counter - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            if (counter == height / 2) {
                counter = -99999;
            } else
                counter++;
            System.out.printf("\n");
        }
    }

    // "A"
    static void charA() {
        int n = width / 2, i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j <= width; j++) {
                if (j == n || j == (width - n)
                        || (i == height / 2 && j > n
                                && j < (width - n)))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            n--;
        }
    }

    // "R"
    static void charR() {
        int i, j, half = (height / 2);
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < width; j++) {
                if ((i == 0 || i == half)
                        && j < (width - 2))
                    System.out.printf("*");
                else if (j == (width - 2)
                        && !(i == 0 || i == half))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    // "K"
    static void charK() {
        int i, j, half = height / 2, n = half;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j <= half; j++) {
                if (j == absoluteVal(n))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            n--;
        }
    }

    public static void main(String[] args) throws Exception {
        charM();
        System.out.println();
        charA();
        System.out.println();
        charR();
        System.out.println();
        charK();
    }
}
