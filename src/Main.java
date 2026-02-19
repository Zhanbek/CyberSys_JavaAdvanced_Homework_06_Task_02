
import java.lang.reflect.Method;
import java.util.Scanner;

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
            secondOperand = 3
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
            System.out.println();
            System.out.println("Витягуємо значення операндів з анотації...");
            System.out.println();
            double first = calculateTwoOperandsMethodInfo.getAnnotation(TwoOperandsAnno.class).firstOperand();
            double second = calculateTwoOperandsMethodInfo.getAnnotation(TwoOperandsAnno.class).secondOperand();

            System.out.printf("Значення першого операнда = %f", first);
            System.out.println();
            System.out.printf("Значення другого операнда = %f", second);
            System.out.println();

            System.out.println();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Вкажіть операцію: '+', '-', '*', '/': ");
            String operation = scanner.nextLine();

            Calculator calculator = new Calculator(first, second);

            double result = 0.00;
            if (operation.equals("+")) {
                result = calculator.sum(first, second);
            } else if (operation.equals("-")) {
                result = calculator.sub(first, second);
            } else if (operation.equals("*")) {
                result = calculator.mul(first, second);
            } else if (operation.equals("/")) {
                result = calculator.div(first, second);
            } else {
                System.out.printf("Помилка! Дана %s операція не реалізована в даному додатку!%n", operation);
            }

            System.out.println();
            System.out.printf("Результат операції %f %s %f  = %f", first, operation, second, result);
            System.out.println();
        }


    }
}