public class MergeSort {
    public static void main(String[] args) {
        int [] arr = new int[]{5,2,4,1,4,1,3};
        MergeSort obj = new MergeSort();
        printArr(arr);
        arr = obj.mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }

    public static void printArr(int [] arr) {
        for(int i : arr) {
            System.out.print(i+",");
        }
        System.out.println();
    }

    public int [] mergeSort(int [] arr, int start , int end) {
        if(start == end) {
            int [] copyArr = new int [1];
            copyArr[0] = arr[start];
            return copyArr;
        }else {
            int [] arr1 = mergeSort(arr, start, (start+end)/2);
            int [] arr2 = mergeSort(arr, ((start+end)/2)+1, end);
            return merge(arr1, arr2);
        }
    }

    public int [] merge(int [] arr1, int [] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int [] resultArr = new int[arr1Length+arr2Length];
        int i = 0 , j = 0 , itr = 0 ;
        while(itr != resultArr.length){
            if( i == arr1Length) {
                while( j != arr2.length){
                    resultArr[itr] = arr2[j];
                    j++;
                    itr++;
                }

            }else if ( j == arr2Length) {
                while( i != arr1.length) {
                    resultArr[itr] = arr1[i];
                    i++;
                    itr++;
                }
            }else {
                if(arr1[i] < arr2[j]) {
                    resultArr[itr] = arr1[i];
                    i++;
                    itr++;
                }else {
                    resultArr[itr] = arr2[j];
                    j++;
                    itr++;
                }
            }
        }
       
        return resultArr;
    }
}