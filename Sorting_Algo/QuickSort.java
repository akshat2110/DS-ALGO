public class QuickSort{
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int swapIdx = low-1;
        for(int i=low; i<high; i++){
            if(arr[i]<pivot){
                swapIdx++;
                swap(arr, swapIdx, i);
            }
        }
        swapIdx++;
        swap(arr, swapIdx, high);
        return swapIdx;
    }

    static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int idx_pivot = partition(arr, low, high);
            quickSort(arr, low, idx_pivot-1);
            quickSort(arr, idx_pivot+1, high);
        }
    }

    public static void main(String[] args){
        int array[] = {7, 9, 1, 3, 5, 2, 6, 0, 4, 8}; 
        int n = array.length-1;
        quickSort(array, 0, n);
        for(int i=0; i<=n; i++){
            System.out.print(array[i]+" ");
        }
    }
}