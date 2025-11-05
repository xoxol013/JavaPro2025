package hm_16.Operations;

import hm_16.Interface.MathOperation;
import hm_16.Interface.StringManipulator;

public class OperationFactory {

    // Anonymous class for addition
    public static MathOperation createAdditionOperation() {
        return new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
    }

    // Lambda for converting text to uppercase
    public static StringManipulator createUppercaseManipulator() {
        return s -> s.toUpperCase();
    }
}
