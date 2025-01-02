package behavioral.command.AppCalculator;

public class CommandHandler {
    float result = 0;

    public float getResult() {
        return result;
    }

    public void handle(char operator, float operand) {
        float first_operand = result;
        switch (operator){
            case '+':
                result += operand;
                break;
            case '-':
                result -= operand;
                break;
            case '*':
                result *= operand;
                break;
            case '/':
                result /= operand;
                break;
        }
        System.out.println(first_operand + " " + operator + " " + operand + " = " + result);
    }
}
