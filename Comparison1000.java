import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Comparison1000 {
    public static void main(String[] args) {
        // Membuat array dan ArrayList dengan 1000 elemen
        int[] array = new int[1000];
        ArrayList<Integer> arrayList = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int value = random.nextInt(1000); // Nilai acak antara 0-999
            array[i] = value;
            arrayList.add(value);
        }

        // Elemen yang akan dicari
        int searchValue = 500; // Pilih elemen acak dari array untuk konsistensi

        // Pencarian pada Array menggunakan Linear Search
        long start = System.nanoTime();
        int arrayIndex = ArrayOperations.linearSearch(array, searchValue);
        long end = System.nanoTime();
        System.out.printf("Waktu pencarian pada Array: %.4f ms\n", (end - start) / 1_000_000.0);
        System.out.println("Ditemukan di indeks: " + arrayIndex);

        // Pencarian pada ArrayList menggunakan indexOf
        start = System.nanoTime();
        int listIndex = ArrayListOperations.search(arrayList, searchValue);
        end = System.nanoTime();
        System.out.printf("Waktu pencarian pada ArrayList: %.4f ms\n", (end - start) / 1_000_000.0);
        System.out.println("Ditemukan di indeks: " + listIndex);
    }
}