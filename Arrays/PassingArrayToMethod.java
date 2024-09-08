package Arrays;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int x =5;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }

    private static void change(int x) {
         x = 10;
    }
}
