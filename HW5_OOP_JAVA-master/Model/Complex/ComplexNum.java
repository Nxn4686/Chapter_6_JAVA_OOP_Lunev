package Model.Complex;
/**
 * Класс, представляющий комплексное число
 */
public class ComplexNum<T extends Number> {
    private double real;
    private double imag;

    /**
     * Конструктор с двумя параметрами
     *
     * @param real действительная часть комплексного числа
     * @param imag мнимая часть комплексного числа
     */
    public ComplexNum(T real, T imag) {
        this.imag = imag.doubleValue();
        this.real = real.doubleValue();
    }

    /**
     * Метод возвращает действительную часть комплексного числа
     *
     * @return действительная часть комплексного числа
     */
    public double getReal() {
        return real;
    }

    /**
     * Метод возвращает мнимую часть комплексного числа
     *
     * @return мнимая часть комплексного числа
     */
    public double getImag() {
        return imag;
    }

    /**
     * Метод сложения двух комплексных чисел
     *
     * @param num комплексное число
     * @return сумма двух комплексных чисел
     */
    public ComplexNum<Double> addition(ComplexNum<T> num) {
        double real2 = num.getReal();
        double imag2 = num.getImag();
        return new ComplexNum<>(this.real + real2, this.imag + imag2);
    }

    /**
     * Метод вычитания первого комплексного числа от второго
     *
     * @param num комплексное число
     * @return равзность двух комплексных чисел
     */
    public ComplexNum<Double> subtraction(ComplexNum<T> num) {
        double real2 = num.getReal();
        double imag2 = num.getImag();
        return new ComplexNum<>(this.real - real2, this.imag - imag2);
    }

    /**
     * Метод произведения двух комплексных чисел
     *
     * @param num комплексное число
     * @return произведение двух комплексных чисел
     */
    public ComplexNum<Double> multiplication(ComplexNum<T> num) {
        double real2 = num.getReal();
        double imag2 = num.getImag();
        return new ComplexNum<>(this.real * real2 - this.imag * imag2,
                this.imag * real2 + this.real * imag2);
    }

    /**
     * Метод разделения первого комплексного числа на второе
     *
     * @param num комплексное число
     * @return частное двух комплексных чисел
     */
    public ComplexNum<Double> division(ComplexNum<T> num) {
        double real2 = num.getReal();
        double imag2 = num.getImag();
        double newReal = (this.real * real2 + this.imag * imag2) / (real2 * real2 + imag2 * imag2);
        double newImag = (real2 * this.imag - this.real * imag2) / (real2 * real2 + imag2 * imag2);

        return new ComplexNum<>(newReal, newImag);
    }

    @Override
    public String toString() {
        if (this.imag > 0) {
            return this.real + " + " + "i";
        } else if (this.imag < 0) {
            return this.real + "-" + "i";
        } else {
            return String.format("%s", this.real);
        }
    }

    /**
     * Выводит на консоль комплексное число
     */
    public void showComplexValue() {
        System.out.println(this.toString());
    }
}
