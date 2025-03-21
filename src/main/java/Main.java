import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void exit(String[] args) {
        scanner.close();
        System.exit((args.length > 1) ? Integer.parseInt(args[1]) : 0);
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.print("$ ");
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s");

            switch(tokens[0]) {
                case "exit": exit(tokens); break;
                default: System.out.println(input + ": command not found");
            };
        }
    }
}
