public class Calculator {

    @TwoOperandsAnno(firstOperand = 39, secondOperand = 21)
    public static int sum(int first, int second) {
        return first + second;
    }
}
