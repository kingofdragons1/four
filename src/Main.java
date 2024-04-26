// Задание 4.1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        System.out.println("Введите подстроку:");
        String subStr = scanner.nextLine();
        int count = str.split(subStr, -1).length - 1;
        System.out.println("Подстрока '" + subStr + "' встречается " + count + " раза");
    }

}
