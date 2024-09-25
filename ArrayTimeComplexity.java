public class ArrayTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Measure time for search operation
            long startTime = System.nanoTime();
            
            // Searching for the last element
            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (array[i] == size - 1) {
                    found = true;
                    break;
                }
            }
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search in array of size " + size + ": " + duration + " nanoseconds");
      
            // Measure time for insertion operation 
            startTime = System.nanoTime();
      
            // Inserting an element at the beginning (Simulating it by shifting elements right)
            for (int i = size - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = size; // Insert at the beginning
      
            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for insertion in array of size " + size + ": " + duration + " nanoseconds");

            // Measure time for deletion operation
            startTime = System.nanoTime();
      
            // Deleting the last element (simulated by setting it to 0, though arrays are fixed size)
            array[size - 1] = 0;
            
            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for deletion in array of size " + size + ": " + duration + " nanoseconds");

            System.out.println("------------------------------------------------");
        }
    }
}


