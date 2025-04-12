import java.util.Arrays;

public class ArrayOperations {
    // Traversal (menampilkan isi Array)
    public static void traverse(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // Pencarian nilai dalam Array (linear search)
    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    // Pencarian nilai dalam Array (binary search)
    public static int binarySearch(int[] array, int value) {
        Arrays.sort(array); // Pastikan array terurut
        return Arrays.binarySearch(array, value);
    }

    // Penyisipan nilai ke dalam Array
    public static int[] insert(int[] array, int value, int position) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, position);
        newArray[position] = value;
        System.arraycopy(array, position, newArray, position + 1, array.length - position);
        return newArray;
    }

    // Penghapusan nilai dari Array
    public static int[] delete(int[] array, int position) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, position);
        System.arraycopy(array, position + 1, newArray, position, array.length - position - 1);
        return newArray;
    }
}