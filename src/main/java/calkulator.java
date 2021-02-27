import javax.management.PersistentMBean;
import java.util.Scanner;
import java.util.Stack;

class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number1 = getInt();
        int number2 = getInt();
        char operation = getOperations();
       System.out.println("Результат вычесления: "+  calc(number1,number2,operation));
    }


    public static int getInt(){
            System.out.println("введите целостное число");
            int number = scanner.nextInt();
            return number;
    }
        public static char getOperations(){
            System.out.println("выберите операцию (*;/;+;-)");
           char operation=scanner.next().charAt(0);
           return operation;

    }

    public static int calc(int num1, int num2, char operatin) {
        int result = 0;
        switch (operatin) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;


    }

    }
