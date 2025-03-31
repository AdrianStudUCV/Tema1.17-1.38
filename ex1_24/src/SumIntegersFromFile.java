
import java.io.*;
import java.util.*;

public class SumIntegersFromFile {

    public static void main(String[] args) {
        String filePath = "N:\\java\\ex1_24\\src\\input"; // Specificați calea fișierului aici
        int sum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\s+"); // Separare după spațiu
                for (String token : tokens) {
                    try {
                        int number = Integer.parseInt(token);
                        sum += number;
                    } catch (NumberFormatException ignored) {
                        // Ignorăm valorile care nu sunt numere întregi
                    }
                }
            }
            System.out.println("Suma numerelor întregi: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("Eroare: Fișierul nu a fost găsit!");
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului: " + e.getMessage());
        }
    }
}
