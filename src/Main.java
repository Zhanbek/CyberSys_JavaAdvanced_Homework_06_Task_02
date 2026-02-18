
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Class<?> classInfo = Calculator.class;

        try {
            Method methodSumInfo = classInfo.getMethod("sum", int.class, int.class);

            TwoOperandsAnno methodSumAnno = methodSumInfo.getAnnotation(TwoOperandsAnno.class);

            int result = Calculator.sum(methodSumAnno.firstOperand(), methodSumAnno.secondOperand());

            System.out.println(result);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}