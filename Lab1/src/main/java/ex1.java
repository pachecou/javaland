import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.printf("%d, %o, %x\n", number, number, number);
        double invNumber = 1.0/number;
        System.out.printf("%a", invNumber);
    }
    // про форматы https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Formatter.html
}
