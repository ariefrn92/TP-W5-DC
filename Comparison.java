import java.util.ArrayList;
import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        // Array Traversal
        System.out.print("Array Traversal: ");
        ArrayOperations.traverse(array);

        // ArrayList Traversal
        System.out.print("ArrayList Traversal: ");
        ArrayListOperations.traverse(arrayList);

        // Pencarian pada Array
        int arraySearchValue = 30;
        int arrayIndex = ArrayOperations.linearSearch(array, arraySearchValue);
        System.out.println("\nPencarian " + arraySearchValue + " dalam Array: " +
                (arrayIndex != -1 ? "Ditemukan di indeks " + arrayIndex : "Tidak ditemukan"));

        // Pencarian pada ArrayList
        int listIndex = ArrayListOperations.search(arrayList, arraySearchValue);
        System.out.println("Pencarian " + arraySearchValue + " dalam ArrayList: " +
                (listIndex != -1 ? "Ditemukan di indeks " + listIndex : "Tidak ditemukan"));

        // Penyisipan nilai dalam Array
        int insertValue = 25;
        array = ArrayOperations.insert(array, insertValue, 2);
        System.out.print("\nArray setelah penyisipan elemen " + insertValue + ": ");
        ArrayOperations.traverse(array);

        // Penyisipan nilai dalam ArrayList
        ArrayListOperations.add(arrayList, insertValue);
        ArrayListOperations.sort(arrayList); // Mengurutkan agar konsisten dengan operasi array
        System.out.print("ArrayList setelah penyisipan elemen " + insertValue + ": ");
        ArrayListOperations.traverse(arrayList);

        // Mengukur waktu eksekusi
        long start, end;

        start = System.nanoTime();
        ArrayOperations.linearSearch(array, arraySearchValue);
        end = System.nanoTime();
        System.out.printf("\nWaktu eksekusi pencarian pada Array: %.4f ms\n", (end - start) / 1_000_000.0);

        start = System.nanoTime();
        ArrayListOperations.search(arrayList, arraySearchValue);
        end = System.nanoTime();
        System.out.printf("Waktu eksekusi pencarian pada ArrayList: %.4f ms\n", (end - start) / 1_000_000.0);
    }
}
