import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner first = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = first.nextInt();
        Scanner second = new Scanner(System.in);
        System.out.println("Введите число b: ");
        int b = second.nextInt();


        if (a < b) {
            System.out.println("a меньше b");
        } else if (a > b) {
            System.out.println("a больше b");
        } else {
            System.out.println("a равно b");
        }
    }
}
