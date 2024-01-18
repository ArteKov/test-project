public class CalcSwitchCase {

    public static void main(String[] args) {
        calc(5, 2, '+');
        calc(5, 2, '-');
        calc(5, 2, '/');
        calc(5, 2, '*');
        calc(5, 2, '?');
    }

    static double calc(double paramA, double paramB, char operation) {
        double result = 0;

        switch (operation) {
            case '+':
                result = paramA + paramB;
                break;
            case '-':
                result = paramA - paramB;
                break;
            case '/':
                result = paramA / paramB;
                break;
            case '*':
                result = paramA * paramB;
                break;
            default:
                System.out.println("INCORRECT OPERATION!");
                break;
        }

        System.out.println("Calc result: " + result);
        return result;
    }
}
