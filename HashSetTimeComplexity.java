import java.util.HashSet;

public class HashSetTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of HashSets
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with integers
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            // 1. Measure time for search operation
            long startTime = System.nanoTime();
            
            // Searching for the last element
            boolean found = hashSet.contains(size - 1);  
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Time taken for search in HashSet of size " + size + ": " + duration + " nanoseconds");

            // 2. Measure time for insertion operation
            startTime = System.nanoTime();
            
            // Inserting a new element at the end (which is simply adding to the set)
            hashSet.add(size);
            
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for insertion in HashSet of size " + size + ": " + duration + " nanoseconds");

            // 3. Measure time for deletion operation
            startTime = System.nanoTime();
            
            // Deleting the last element
            hashSet.remove(size - 1);  // Removing the element at the end
            
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for deletion in HashSet of size " + size + ": " + duration + " nanoseconds");

            System.out.println("------------------------------------------------");
        }
    }
}

