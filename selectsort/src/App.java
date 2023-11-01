public class App {

    public static int [] selectsort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        int [] arr = {2,4,6,8,0,1,3,5,7,9};

        int []newarr = selectsort(arr);

        for(int i : newarr){
            System.out.println(i);
        }





    }
}