package Model.RealNumber;
/**
 * Возведение в степень
 */
public class Power implements ICalc {
    /**
     * Статический метод, возвращает результат возведения первого числа в степень второго числа
     * @param args массив арументов
     * @return возвращает результат  возведения первого числа массива в степень второго числа массива, остальные числа игнорируются
     * @param <T> обобщение типа аргументов метода
     */
    public static <T extends Number> double result(T... args) {
        return Math.pow(args[0].doubleValue(), args[1].doubleValue());
    }

}
