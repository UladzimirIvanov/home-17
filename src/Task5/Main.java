package Task5;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /*Используя Supplier написать метод, который будет возвращать введенную с консоли
        строку задом наперед.*/
        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            StringBuilder userInput = new StringBuilder(scanner.nextLine()).reverse();
            return String.valueOf(userInput);
        };
        System.out.println(supplier.get());
    }
}
