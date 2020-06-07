package  manuela.m2ex;

public class Sorting {
    public static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void bubbleSort(int[] data) {
    	for(int i = 0; i < data.length; i++) {
            boolean flag = false;
            for(int j = 0; j < data.length-1; j++) {
            	// If the element j is greater than the next then
                // exchange the values
                if(data[j]>data[j+1]) {
                    int k = data[j];
                    data[j] = data[j+1];
                    data[j+1] = k;
                    flag=true; //the change is happended and flag is true
                }
            }
            if(!flag) break; // If flag = false then it means that in the last iteration
            // there were no exchanges, so the method can end
            // because the array is ordered
        }
    }

    public static void selectionSort(int[] data) {
    	 
       } 


    public static void insertionSort(int[] data) {
        // TODO
    }

    private static void merge(int[] data, int left, int pivot, int right) {
        // TODO
    }

    private static void mergeSort(int[] data, int left, int right) {
        
        int pivot = (left + right) / 2;
        merge(data, left, pivot, right);
    }

    public static void mergeSort(int[] data) {
        mergeSort(data, 0, data.length - 1);
    }

    /**
     * Partition a section of an array, smallest values on the left
     * 
     * @param data  the array to be partitioned
     * @param left  first element index
     * @param right last element index
     * @return pivot index
     */
    private static int partition(int[] data, int left, int right) {
        // TODO
        return 0;
    }

    private static void quickSort(int[] data, int left, int right) {
        // TODO
        partition(data, left, right);
    }

    public static void quickSort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }
}
