package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Класс, который реализует взаимодествие пользователя с программой через консоль
 */
public class Console {
    /**
     * Метод получает массив аргументов
     *
     * @param msg выводимый на консоль текст
     * @return возвращает массив аргументов
     */
    public Double[] getData(String msg) {
        System.out.println(msg);
        List<Double> res = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            res.add(scanner.nextDouble());
        }
        return res.toArray(new Double[0]);
    }

    /**
     * выводит на консоль результат
     * @param msg  текст на консоль
     * @param result результат вычислений
     */
    public void showResult(String msg, double result) {
        System.out.printf("%s: %s\n", msg, result);
    }

    /**
     * меню взаимодейстия через консоль
     *
     * @return возвращает введенное пользователем строку
     */
    public String Menu() {
        System.out.println("""
                Введите число для выбора действия:
                0 - сложение
                1 - вычитание
                2 - умножение
                3 - деление
                4 - возведение в степень
                5 - квадратный корень
                Чтобы выйти, нажмите q
                """);
        return new Scanner(System.in).next();
    }


}
