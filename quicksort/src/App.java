public class App {
    public static void main(String[] args) {
        int []arr = {1,6,2,5,3,4};
        qsort(arr, 0, arr.length - 1);
        for(int i : arr){
            System.out.println(i);
        }
        

    }
    
    public static  void qsort(int []arr, int start, int end){
       
        if(start < end) {
            int p = part(arr, start, end);
            qsort(arr, start, p - 1);
            qsort(arr, p + 1, end);
            
        }
    }

    public static int part(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start;
    
        for(int j = start; j < end; j++){
            if(arr[j] <= pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
    
                i++;
            }
        }
        
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
    
        return i;
    }

}
