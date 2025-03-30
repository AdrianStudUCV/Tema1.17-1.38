import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortareLista {

    public static void main(String[] args) {
        // Crearea unei liste de numere întregi
        List<Integer> numere = new ArrayList<>();
        numere.add(5);
        numere.add(1);
        numere.add(8);
        numere.add(3);
        numere.add(2);

        // Afișare listă înainte de sortare
        System.out.println("Lista înainte de sortare: " + numere);

        // Sortarea listei folosind Collections.sort()
        Collections.sort(numere);
        //Se utilizează metoda Collections.sort(numere), care sortează lista în ordine crescătoare
        //Această metodă folosește algoritmul TimSort, care este eficient și optimizat.


        // Afișare listă după sortare
        System.out.println("Lista după sortare: " + numere);
    }

}
