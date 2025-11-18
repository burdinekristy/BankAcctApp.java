import java.util.Scanner;

public class DataEntry {
    private static Scanner sc = new Scanner(System.in);
    
    public static String getString(String prompt) {
            System.out.print(prompt);
            return sc.nextLine().trim();
    }

    public static String getStringWithLimit(String prompt, int maxLength) {
        String input;
        do {
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if (!input.isBlank() && input.length() <= maxLength) {
                return input;
            }
            System.out.println("Invalid input. Must be non-blank and max " + maxLength + " characters.");
        } while (true);
    }

    public static String getNumericString(String prompt, int length) {
        String input;
        do {
            System.out.println(prompt);
            input = sc.nextLine().trim();
            if (input.matches("\\d{" + length + "}")) {
                return input;
            }
            System.out.println("Invalid input. Must be " + length + " numeric digits.");
        } while (true);
    }

    public static int getInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    public static int getIntegerRange(String prompt, int min, int max) {
        int value;
        do {
            value = getInt(prompt);
            if (value >= min && value <= max) return value;
            System.out.println("Value must be between " + min + " and " + max + ".");
    } while (true);
        try {
            System.out.print(prompt);
            return Double.parseDouble(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a decimal number.");
        }
    }

public static double getDoubleInRange(String prompt, double min, double max) {
    double value;
    do {
        value = getDouble(prompt);
        if (value >= min && value <= max) return value;
        System.out.println("Value must be between " + min + " and " + max + ".");
    } while (true);
}

public static String getDate(String prompt) {
    String input;
    do {
        System.out.print(prompt);
        input = sc.nextLine().trim();
        if (input.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return input;
        }
        System.out.println("Invalid date format. Use YYYY-MM-DD.");
    } while (true);
}
}
