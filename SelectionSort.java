class SelectionSort{

    public static void selectionSort(int arr[]){
     
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;  // here we are assigning index value of i(minPos) to j
                }
            }
            //swap in outer loop to reduce the number of swaps every time(better than Bubble Sort)
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;    // here the swapping to elements(values present at those indexes)
        }
    }

    public static void printArr(int arr[]){
     for(int i=0; i<arr.length;i++){
        System.out.print(arr[i] + " ");
     }
     System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
 
        selectionSort(arr);
        printArr(arr);
    }
}