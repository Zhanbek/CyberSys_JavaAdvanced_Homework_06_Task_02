import java.lang.annotation.*;

/**
 * Анотація для передачі параметрів калькулятору.
 * Використовується для вказівки двох чисел і операції.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface TwoOperandsAnno {
    /**
     * Перший операнд.
     *
     * @return перше число
     */
    double firstOperand() default 0;

    /**
     * Другий операнд.
     *
     * @return друге число
     */
    double secondOperand() default 0;

    /**
     * Тип операції.
     * Можливі значення: add, sub, mul, div
     *
     * @return рядок операції
     */
    String operation() default "sum";  // sum, sub, mul, div
}
