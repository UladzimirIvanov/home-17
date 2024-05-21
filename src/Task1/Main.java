package Task1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате yyyy-MM-dd");
        LocalDate dateUserBirthday = LocalDate.parse(scanner.next());
        //System.out.println("You Birthday: " + dateUserBirthday);
        System.out.println("Вам исполнится 100 лет: " + dateUserBirthday.plusYears(100));
    }
}
