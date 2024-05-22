package Task3;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        /*Используя Function реализовать лямбду, которая будет принимать в себя строку в
        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        возвращать сумму, переведенную сразу в доллары.*/
        Scanner scanner = new Scanner(System.in);
        Double USD = 3.2008;
        System.out.println("Введите сумму в формате \"*сумма* BYN\"");
        String[] userInputStr = scanner.nextLine().split(" ");
        Integer userNumber = (Integer.parseInt(userInputStr[0]));

        Function<Integer, Double> usaMoney = x -> x * USD;
        double result = usaMoney.apply(userNumber);
        System.out.println(result + "$");
    }
}
