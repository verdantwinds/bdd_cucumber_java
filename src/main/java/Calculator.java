import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Calculator {

    private final Deque<Number> stack = new LinkedList<>();
    private static final List<String> OPERATORS = List.of("+", "-", "/", "*");

    public void push(Object arg) {
        if(OPERATORS.contains(arg)) {
            Number y = stack.removeLast();
            Number x = stack.removeLast();
            Double answer = null;
            if(arg.equals("+")) {
                answer = x.doubleValue() + y.doubleValue();
            }
            if(arg.equals("-")) {
                answer = y.doubleValue() - x.doubleValue();
            }
            if(arg.equals("/")) {
                answer = x.doubleValue() / y.doubleValue();
            }
            if(arg.equals("*")) {
                answer = y.doubleValue() * x.doubleValue();
            }

            push(answer);
        } else {
            try {
                double num = Double.parseDouble(arg.toString());
                stack.add((Number) arg);
            } catch (NumberFormatException e) {
                push("+");
            }

        }
    }

    public Number value() {
        return stack.getLast();
    }
}
