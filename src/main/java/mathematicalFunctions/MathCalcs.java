package mathematicalFunctions;

public class  MathCalcs implements ImathCalcs{
    @Override
    public double add(float firstNumber, float secondNumber) {
        return firstNumber+secondNumber;
    }

    @Override
    public double subtract(float firstNmber, float secondNUmber) {
        return firstNmber-secondNUmber;
    }

    @Override
    public double multiply(float firstNumber, float secondNUmber) {
        return firstNumber*secondNUmber;
    }

    @Override
    public double divide(float numerator, float denominator) {
        return numerator/denominator;
    }
}
