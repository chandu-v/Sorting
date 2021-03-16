public class QuickSortImpl {
    public static void main(String[] args) {
        int [] arr = new int[]{10,80,40,50,90,70};
        QuickSort quickSort = new QuickSort(arr);
        quickSort.quickSortAlgo(arr, 0, 5);
    }
}

class QuickSort {
    int [] arr ;

    public QuickSort(int [] arr) {
        this.arr = arr;
    }

    public static void print(int arr[]){
        for(int i : arr) {
            System.out.print(i+",");
        }
        System.out.println();
    }

    public void swap(int [] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int [] arr, int low, int high) {
        int partition = arr[high];
        int i = low-1;
        for(int j = low ; j < high ; j++) {
            if(arr[j] <= partition) {
                i++;
                swap(arr, i, j);
                System.out.print(String.format("i:%S\tj:%S\tpartition:%S\t", i,j,partition));
                print(arr);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    public void quickSortAlgo(int [] arr, int low, int high) {
        print(arr);
        if(low < high) {
            int p = partition(arr, low, high);
            System.out.println(p);
            quickSortAlgo(arr, low, p-1);
            quickSortAlgo(arr, p+1, high);
        }
        print(arr);
    }
}