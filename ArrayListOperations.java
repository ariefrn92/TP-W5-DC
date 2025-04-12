import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    // Traversal
    public static void traverse(ArrayList<Integer> list) {
        System.out.println(list);
    }

    // Melakukan pencarian element dalam ArrayList
    public static int search(ArrayList<Integer> list, int value) {
        return list.indexOf(value);
    }

    // Menambahkan elemen ke dalam ArrrayList
    public static void add(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    // Menghapus elemen dari ArrayList
    public static void remove(ArrayList<Integer> list, int position) {
        list.remove(position);
    }

    // Mengurutkan elemen dalam ArrayList
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}