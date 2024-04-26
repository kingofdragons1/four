// Задание 4.4

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Twobasic {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг':");
        String date = scanner.nextLine();
        SimpleDateFormat oldFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateObj = oldFormat.parse(date);
        String newDate = newFormat.format(dateObj);
        System.out.println(newDate);
    }
}
