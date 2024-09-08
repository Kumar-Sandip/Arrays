package Arrays;

public class Find_Roll_number {
    public static void main(String[] args) {

        int[] arr = {10, 20, 21, 40, 50, 60, 70, 80};//Declaration................
        int n = arr.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            if (arr[i] < 35) {
                System.out.print(i + "fail,"+" ");

            } else {
                System.out.print("pass,"+" ");
            }

        }    }

    }

