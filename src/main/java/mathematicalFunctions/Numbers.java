package mathematicalFunctions;

public class Numbers extends  MathCalcs{
    private float firstNumber;
    private String operation;
    private float secondNumber;

    public void setSecondNumber(float secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setFirstNumber(float firstNumber) {
        this.firstNumber = firstNumber;
    }



    public double runOperation(){

        switch (operation){
            case "+":
                return add(firstNumber, secondNumber);

            case "-":
                return subtract(firstNumber,secondNumber);

            case "*":
                return multiply(firstNumber,secondNumber);

            case "/":
                return divide(firstNumber,secondNumber);

            default:
                return 0.0;
        }
    }
}
