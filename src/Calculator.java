/**
 * Клас калькулятора
 */
public class Calculator {
    /**
     * Перший операнд.
     */
    private double first;

    /**
     * Другий операнд.
     */
    private double second;

    /**
     * Конструктор калькулятора.
     *
     * @param first перший операнд
     * @param second другий операнд
     */
    public Calculator(double first, double second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Виконує додавання.
     *
     * @return результат додавання
     */
    public double sum(double first, double second) {
        return first + second;
    }

    /**
     * Виконує віднімання.
     *
     * @return результат віднімання
     */
    public double sub(double first, double second) {
        return first - second;
    }

    /**
     * Виконує множення.
     *
     * @return результат множення
     */
    public double mul(double first, double second) {
        return first * second;
    }

    /**
     * Виконує поділ.
     *
     * @return результат поділу
     * @throws ArithmeticException якщо ділення на нуль
     */
    public double div(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Деление на ноль запрещено");
        }
        return first / second;
    }
}
