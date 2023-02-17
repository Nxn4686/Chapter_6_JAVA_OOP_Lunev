package Core;

import Model.RealNumber.*;
import UI.Console;

/**
 * Класс Калькулятор, реализующий различные математичекие операции
 */
public class Calculator {
    /**
     * Метод запускает программу в цикле до ввода "q"
     */
    public static void start() {
        Console console = new Console();
        String button = console.Menu();

        while (!button.equals("q")) {
            switch (button) {
                case "0":
                    console.showResult("Результат сложения: ",
                            Summation.result(console.getData("Вводите аргументы сложения:\n")));
                    break;
                case "1":
                    console.showResult("Результат вычитания: ",
                            Substraction.result(console.getData("Вводите аргументы вычитания:\n")));
                    break;
                case "2":
                    console.showResult("Результат умножения: ",
                            Multiplication.result(console.getData("Вводите аргументы умножения:\n")));
                    break;
                case "3":
                    console.showResult("Результат деления: ",
                            Division.result(console.getData("Вводите аргументы деления:\n")));
                    break;
                case "4":
                    console.showResult("Результат возведения в степень: ",
                            Power.result(console.getData("Вводите аргументы:\n")));
                    break;
                case "5":
                    console.showResult("Результат извлечения корня: ",
                            Sqrt.result(console.getData("Введите число:\n")));
                    break;
                default:
                    System.out.println("Такой операции нет.");
                    break;
            }
            button = console.Menu();
        }
    }
}
