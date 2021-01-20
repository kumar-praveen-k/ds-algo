package algo.sort.Insertion;

public class InsertionSort {
    public void sort(int[] arr){
        int n = arr.length;
        findSort(arr, n);
    }
    static void findSort(int[] arr,int n){
        for(int i = 0; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
