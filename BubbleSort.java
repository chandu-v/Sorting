public class BubbleSort {
    
    public static void main(String[] args) {
        int [] arr = new int[]{4,1,3,4,4,6,7,2,3};
        printArr(arr);
        BubbleSort obj = new BubbleSort();
        arr = obj.bubbleSort(arr);
        printArr(arr);
    }

    public static void printArr(int [] arr) {
        for(int i : arr) {
            System.out.print(i+",");
        }
        System.out.println();
    }

    public int [] bubbleSort(int [] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = i+1 ; j < arr.length ; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                printArr(arr);
            }
        }
        return arr;
    }
}
