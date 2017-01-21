import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1, operand2;
        System.out.println("Введите знак арифметической операции и нажмите Enter, далее ");
        System.out.println("введите первую цифру для арифметической операции, нажмите Enter и вторую цифру нажмите Enter: ");
        Scanner in = new Scanner(System.in); // Объект класса Scanner для обработки ввода с клавиатуры.

        String sign = in.next(); // Создаем строковую локальную переменную с именем sign
        // и принимаем от нее ввод от пользователя до первого пробела.
        operand1 = in.nextInt();

        operand2 = in.nextInt();

        int equally;


        switch (sign) {
            case "+": {
                equally = operand1 + operand2;
                System.out.println("Ответ: ");
                System.out.println(equally);
                break;
        }
            case "-": {
                equally = operand1 - operand2;
                System.out.println("Ответ: ");
                System.out.println(equally);
                break;
        }
            case "/": {
                equally = operand1 / operand2;
                System.out.println("Ответ: ");
                System.out.println(equally);
                break;
        }
            case "*": {
                equally = operand1 * operand2;
                System.out.println("Ответ: ");
                System.out.println(equally);
                break;
        }
            default: {
                System.out.println("введите знак арифметической операции");
                break;
            }

    }
    }
}

