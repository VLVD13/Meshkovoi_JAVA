import java.util.Objects;
import java.util.Scanner;
public class second {
    public static void main(String[] args) {

        Scanner first = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String  a = first.nextLine();

        Scanner second = new Scanner(System.in);
        System.out.println("Введите вторую строку: ");
        String  b = second.nextLine();

        if (Objects.equals(a, b)) {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны");
        }
    }
}
