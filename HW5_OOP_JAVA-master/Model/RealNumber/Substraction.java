package Model.RealNumber;

/**
 * Разность, реализует интерфейс Математическая операция
 */
public class Substraction implements ICalc {
    /**
     * Статический метод, возвращает результат вычитания
     *
     * @param args массив арументов
     * @param <T>  обобщение типа аргументов метода
     * @return возвращает результат последовательных вычитаний чисел в массиве
     */
    public static <T extends Number> double result(T... args) {
        double res = args[0].doubleValue();
        for (int i = 1; i < args.length; i++) {
            res -= args[i].doubleValue();
        }
        return res;
    }

}
