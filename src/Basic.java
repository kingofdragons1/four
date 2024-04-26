// Задание 4.3

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг':");
        String date = scanner.nextLine();
        String[] parts = date.split("\\.");
        String newDate = parts[2] + "-" + parts[1] + "-" + parts[0];
        System.out.println(newDate);
    }
}
