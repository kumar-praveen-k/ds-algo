package algo.sort.Bubble;

public class BubbleSort {
    public void sort(int[] arr){
        int n = arr.length;
        findSort(arr, n);
    }
    static void findSort(int[] arr, int n){
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n - i); j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
