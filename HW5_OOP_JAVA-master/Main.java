import Core.Calculator;
import Model.Complex.ComplexNum;

public class Main {
    public static void main(String[] args) {
        //Calculator.start();
        ComplexNum<Integer>complexNum1=new ComplexNum<>(5,-3);
        ComplexNum<Integer>complexNum2=new ComplexNum<>(6,2);
        complexNum1.addition(complexNum2).showComplexValue();


    }
}