package algo.sort.quick;

public class QuickSort {
    public void sort(int[] arr){
        int n = arr.length;
        findSort(arr, 0, n-1);
    }
    private void findSort(int[] arr, int low, int high){
        if(low < high){
            int j = partition(arr, low, high);
            findSort(arr, low, j-1);
            findSort(arr, j+1, high);
        }
    }
    private int partition(int[] arr, int low, int high){
        int n = arr.length;
        int pivot = arr[low];
        int i = low +1;
        int j = high;

        while(i < j) {
            while (i <= high && arr[i] <= pivot) i++;

            while (j >= low && arr[j] > pivot) j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (pivot > arr[j]) {
            int temp = arr[j];
            arr[j] = arr[low];
            arr[low] = temp;
        }

        return j;
    }
}
