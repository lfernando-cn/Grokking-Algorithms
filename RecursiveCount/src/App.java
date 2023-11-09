import java.util.Arrays;

public class App {
   public static void main(String[] args) {
        int [] list = {1,2,3,4,5,6};
        System.out.println(count(list));

   }

   public static int count(int[] list){
        if(list.length == 0){
            return 0;
        }
        else{
            return 1 + count(Arrays.copyOfRange(list,1, list.length));
        }
   }
}
