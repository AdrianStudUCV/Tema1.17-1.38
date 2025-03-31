import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortareStudenti {
    public static void main(String[] args) {
        // Crearea unei liste de studenți
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Ana", 8));
        studenti.add(new Student("Mihai", 10));
        studenti.add(new Student("Elena", 7));
        studenti.add(new Student("Bogdan", 9));

        // Afișare listă înainte de sortare
        System.out.println("Lista înainte de sortare:");
        for (Student s : studenti) {
            System.out.println(s);
        }

        // Sortarea listei după notă folosind Comparator
        Collections.sort(studenti, Comparator.comparingInt(Student::getNota));

        // Afișare listă după sortare
        System.out.println("\nLista după sortare:");
        for (Student s : studenti) {
            System.out.println(s);
        }
    }
}
