import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 3, operand2 = 7;
        System.out.println("Введите знак арифметической операции: ");
        Scanner in = new Scanner(System.in); // Объект класса Scanner для обработки ввода с клавиатуры.

        String sign = in.next(); // Создаем строковую локальную переменную с именем sign
        // и принимаем от нее ввод от пользователя до первого пробела.
        operand1 = in.nextInt();

        operand2 = in.nextInt();

        equally = in.nextInt();



        switch (equally) {
            case "+":
                equally = operand1 + operand2;
                break;
            case "-":

                break;
            case "/":

                break;
            case "*":

                break;
        }
    }
}

