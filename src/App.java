import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Создаем объект логгера
        Logger logger = new Logger();
        // Декорируем операции логгированием
        iCalculable plus = new Decorator(new ComplexPlus(), logger);
        iCalculable multi = new Decorator(new ComplexMulti(), logger);
        iCalculable divide = new Decorator(new ComplexDivide(), logger);
        
        // iCalculable plus = new ComplexPlus();
        // iCalculable multi = new ComplexMulti();
        // iCalculable divide = new ComplexDivide();

        // Создаем объект калькулятора
        iCalculable calculator = new Calculator(plus);

        // Инициализация объекта для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Вводим данные для первого комплексного числа
        System.out.print("Введите действительную часть первого числа: ");
        double real1 = scanner.nextDouble();
        System.out.print("Введите мнимую часть первого числа: ");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber number1 = new ComplexNumber(real1, imaginary1);

        // Вводим данные для второго комплексного числа
        System.out.print("Введите действительную часть второго числа: ");
        double real2 = scanner.nextDouble();
        System.out.print("Введите мнимую часть второго числа: ");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber number2 = new ComplexNumber(real2, imaginary2);

        // Выбираем операцию
        System.out.print("Выберите операцию (+, *, /): ");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                calculator = new Calculator(plus);
                break;
            case "*":
                calculator = new Calculator(multi);
                break;
            case "/":
                calculator = new Calculator(divide);
                break;
            default:
                System.out.println("Неподдерживаемая операция");
                return;
        }
        // Выполняем выбранную операцию и выводим результат
        ComplexNumber result = calculator.ToDo(number1, number2);
        System.out.println("Результат: " + result);
    }
}
