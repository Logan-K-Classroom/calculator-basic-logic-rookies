
public class Exponent {
    public static void main(String[] args) {
        //Retrieves inputs from the autograder.
        double firstNumber = AutoGraderInput.getFirstNumber();
        double secondNumber = AutoGraderInput.getSecondNumber();

        //Default output for result
        double result = Math.pow(firstNumber, secondNumber);

        System.out.print(result);
    }
}
