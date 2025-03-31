
import java.util.Scanner;

public class SumWithExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num1 = null, num2 = null;

        try {
            System.out.print("Introduceți primul număr: ");
            String input1 = scanner.nextLine();
            if (!input1.isEmpty()) {
                num1 = Integer.parseInt(input1);
            }

            System.out.print("Introduceți al doilea număr: ");
            String input2 = scanner.nextLine();
            if (!input2.isEmpty()) {
                num2 = Integer.parseInt(input2);
            }

            if (num1 == null || num2 == null) {
                throw new NullPointerException("Unul dintre numere este NULL!");
            }

            int sum = num1 + num2;
            System.out.println("Suma: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Eroare: Introduceți doar numere întregi valide!");
        } catch (NullPointerException e) {
            System.out.println("Eroare: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}