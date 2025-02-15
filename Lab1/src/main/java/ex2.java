import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int normalizedNumber = number % 360;
        int normalizedNumberFloorMod = Math.floorMod(number, 360);
        System.out.printf("Number: %d\n Normalized number %d\nFloorMod number:", number, normalizedNumber, normalizedNumberFloorMod);

    }
    // доп задание:
     // массив целых чисел любого размера, любых int
     // метод, принимающий массив целых чисел и число k;
     // вернуть массив из двух чисел-индексов исходного массива, между которыми сумма чисел равна k;
     // если таких нет - пустой массив или -1;-1
}
