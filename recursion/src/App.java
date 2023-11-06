public class App {
    public static int fat(int i){
        if (i == 1){
            return 1;
        }
        else{
           return i * fat(i-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fat(5));
    }
}

