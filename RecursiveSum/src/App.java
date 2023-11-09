import java.util.Arrays;

public class App {
    public static void main(String[] args) {
       int []list = {1,2,3,4,5};
        System.out.println(sum(list));

    }

    public static int sum(int []list){
        if(list.length == 0){
            return 0;
        }
        else{
            return list[0] + sum(Arrays.copyOfRange(list, 1, list.length));
        }

    }
}
