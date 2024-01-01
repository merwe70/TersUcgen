import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        Scanner inp = new Scanner(System.in);
        System.out.println("Basamak Sayısını Giriniz :");
        number = inp.nextInt();

        for (int i = 0; i <= (number-1); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (number - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}