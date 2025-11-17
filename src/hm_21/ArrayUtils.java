package hm_21;
//
public class ArrayUtils {

    @MethodInfo(
            name = "sum",
            returnType = "int",
            description = "Calculates the sum two numbers")
    @Author(firstName = "Petro", lastName = "Krupko")

    public int sum(int a, int b) {
        return a + b;
    }

    @MethodInfo(
            name = "multiply",
            returnType = "int",
            description = "Calculates multiplication of two numbers")
    @Author(firstName = "Petro", lastName = "Krupko")

    public int multiply(int a, int b) {
        return a * b;
    }
}
