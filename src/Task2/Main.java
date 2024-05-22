package Task2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        /*Используя Predicate среди массива чисел вывести только те, которые являются положительными*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        String[] userArrStr = scanner.nextLine().split(" ");
        ArrayList<Integer> userArr = new ArrayList<>();

        for (int i = 0; i < userArrStr.length; i++) {
            userArr.add(Integer.parseInt(userArrStr[i]));
            Predicate<Integer> isNotZero = x -> x >= 0;
            if (isNotZero.test(userArr.get(i))){
                System.out.println(userArr.get(i));
            }
        }
        System.out.println(userArr);
    }
}
