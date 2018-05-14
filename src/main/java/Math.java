final class Math {

    static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static int multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    static double divide(int dividend, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Cannot divide by zero (0).");

        return dividend / divisor;
    }
}
