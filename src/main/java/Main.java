import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("$ ");
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s");

            if (tokens[0].equals("exit"))
                break;

            System.out.println(input + ": command not found");

        }

    }
}
