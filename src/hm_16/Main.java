package hm_16;

import hm_16.Interface.MathOperation;
import hm_16.Interface.StringManipulator;
import hm_16.Operations.OperationFactory;
import hm_16.Utils.RandomNumberGenerator;
import hm_16.Utils.StringListProcessor;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        MathOperation addition = OperationFactory.createAdditionOperation();
        System.out.println("Addition: " + addition.operate(2,3));

        StringManipulator upper = OperationFactory.createUppercaseManipulator();
        System.out.println("Uppercase: " + upper.manipulate("love my mom"));

        Function<String, Integer> counter = StringListProcessor::countUppercase;
        System.out.println("Uppercase count: " + counter.apply("My Father BEAST"));

        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(0, 100);
        System.out.println("Random number: " + randomSupplier.get());
    }
}
