import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку I like Java!!!");
        String exclamation = console.nextLine();
        if (exclamation.contains("Java") && exclamation.startsWith("I like") && exclamation.endsWith("!!!")) {
            System.out.println(exclamation.toUpperCase());
        }
        String transformed = exclamation.replace("a", "o");
        String substring = transformed.substring(transformed.indexOf("Jovo"), transformed.indexOf("Jovo") + 4);
        System.out.println("Подстрока, содержащая 'Jovo':");
        System.out.println(substring);
    }
}