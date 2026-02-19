
import java.lang.reflect.Method;

/**
 * Головний клас додатки
 */
public class Main {

    /**
     * Метод, позначений анотацією з параметрами.
     * Тільки для анотації
     */
    @TwoOperandsAnno(
            firstOperand = 21,
            secondOperand = 3,
            operation = "sum"
    )
    public static void calculateTwoOperands() {
    }

    /**
     * Точка входу додатки
     *
     * @param args аргументи командного рядка
     * @throws Exception якщо помилка reflection
     */
    public static void main(String[] args) throws Exception {
        Method calculateTwoOperandsMethodInfo = Main.class.getMethod("calculateTwoOperands");

        if (calculateTwoOperandsMethodInfo.isAnnotationPresent(TwoOperandsAnno.class)) {
            double first = calculateTwoOperandsMethodInfo.getAnnotation(TwoOperandsAnno.class).firstOperand();
            double second = calculateTwoOperandsMethodInfo.getAnnotation(TwoOperandsAnno.class).secondOperand();
            String operation = calculateTwoOperandsMethodInfo.getAnnotation(TwoOperandsAnno.class).operation();

            Calculator calculator = new Calculator(first, second);

            double result = 0.00;
            if (operation.equals("sum")) {
                result = calculator.sum(first, second);
            } else if (operation.equals("sub")) {
                result = calculator.sub(first, second);
            } else if (operation.equals("multiply")) {
                result = calculator.mul(first, second);
            } else if (operation.equals("div")) {
                result = calculator.div(first, second);
            } else {
                System.out.println("Помилка! Дана операція не реалізована в даному додатку!");
            }

            System.out.println(operation + " of " + first + " and " + second + " equals " + result);
        }


    }
}