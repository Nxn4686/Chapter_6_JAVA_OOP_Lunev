import Controller.Calculate;

/**
 * Рефакторинг и\или оптимизация проекта предыдущего дз с учетом теоретических основ SOLID’а
 */
public class MainCalc {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.start();
    }
}