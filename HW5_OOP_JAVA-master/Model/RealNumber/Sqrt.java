package Model.RealNumber;

/**
 * Нахождение квадратного корня
 */
public class Sqrt implements ICalc {
    /**
     * Статический метод, возвращает результат квадратного корня
     *
     * @param args массив арументов
     * @param <T>  обобщение типа аргументов метода
     * @return возвращает результат квадратного корня первого числа массива, остальные числа игнорируются
     */
    public static <T extends Number> double result(T... args) {
        return Math.sqrt(args[0].doubleValue());
    }
}
