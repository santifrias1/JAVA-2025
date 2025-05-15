public class Calculator {

    double Sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    double Subtraction(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    double Multiplication(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    double Division(double numberOne, double numberTwo) {
        if (numberTwo == 0) {
            System.out.println("No es posible dividir por 0.");
            return 0;
        }
        return numberOne / numberTwo;
    }
}
