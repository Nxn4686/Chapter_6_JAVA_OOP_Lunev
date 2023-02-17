package Model.RealNumber;

/**
 * Сумма, реализует интерфейс Математическая операция
 */
public class Summation implements ICalc {
    /**
     * Статический метод, возвращает результат суммирования
     *
     * @param args массив арументов
     * @param <T>  обобщение типа аргументов метода
     * @return возвращает результат последовательного суммирования чисел в массиве
     */
    @SafeVarargs
    public static <T extends Number> double result(T... args) {
        double sum = 0;
        for (T arg : args) {
            sum += arg.doubleValue();
        }
        return sum;
    }
}
