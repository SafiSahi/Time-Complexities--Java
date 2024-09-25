import java.util.ArrayList;

public class TimeComplexityArrayList {
    public static void main(String[] args) {
        // Test for different sizes of ArrayLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with integers
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            // 1. Measure time for search operation (searching for the last element)
            long startTime = System.nanoTime();
            arrayList.contains(size - 1);  // Searching for the last element
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("ArrayList size: " + size + ", search time: " + duration + " nanoseconds");

            // 2. Measure time for insertion operation (inserting at the end)
            startTime = System.nanoTime();
            arrayList.add(size);  // Inserting at the end of the list
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("ArrayList size: " + size + ", insertion time: " + duration + " nanoseconds");

            // 3. Measure time for deletion operation (deleting the last element)
            startTime = System.nanoTime();
            arrayList.remove(size);  // Removing the last inserted element
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("ArrayList size: " + size + ", deletion time: " + duration + " nanoseconds");

            System.out.println("------------------------------------------------");
        }
    }
}

