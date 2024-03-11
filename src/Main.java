import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// Доработать пример с циклом while - преобразуйте его в бесконечный цикл с выходом, если введена строка "Exit"
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        while (str.length() == 0) {
            System.out.print("Please enter smth: ");
            str = scanner.nextLine();
        };

        str = new String();
        scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter smth: ");
            str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.print("We are stopping infinite loop");
                break;
            }
        }

// Доработайте пример с оператором if… else - если пользователь вводит значение вне диапазона 0 - 100, вывести сообщение “Введено некорректное значение” и попросить повторить ввод (использовать цикл):
        System.out.println("Please enter your score: ");
        scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        while (score <= 0 || score >= 100) {
            System.out.println("You've entered invalid value");
            score = scanner.nextInt();
        }

        if (score >= 70) {
            System.out.println("Congrats! You've passed the test!");
        } else {
            System.out.println("Sorry! You've failed the test!");
        }

// Доработайте пример с циклом for - обработайте ситуацию с вводом отрицательного числа
        scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        for (int i = 0; i >= x; i--){
            sum += i;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);

// Реализуйте “пульт дистанционного управления телевизора”: пользователь вводит номер канала, программа выводит название канала. Выход из программы по вводу “0”. Используйте массив.
        System.out.println("This is a remote control task");
        String[] channels = {"","TV1", "TV2", "TV3", "NewsRoom1", "NewsRoom2", "NewsRoom3", "Sport1", "Sport2", "Sport3"};
        scanner = new Scanner(System.in);
        int buttonNumber = Integer.parseInt(scanner.nextLine());
        if (buttonNumber <= 0 || buttonNumber > 9) {
            return;
        }
        System.out.println(channels[buttonNumber]);
    }
}
