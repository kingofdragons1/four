// Задание 4.2

import java.util.Scanner;

public class Great {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        str = str.replace("кака", "вырезано цензурой");
        str = str.replace("бяка", "вырезано цензурой");
        System.out.println(str);
    }
}
