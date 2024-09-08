package Arrays.Linear_Search;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the target element: ");
        int x = sc.nextInt();
        System.out.println("Enetr the Array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        //solution of code ...........
        boolean flag = false;// false means element is not found...
        for (int i = 0; i < n; i++) {
            if (arr[i]==x){
          flag = true;// true mens element is found...
                break;
            }
        }
        if (flag==true) System.out.println("Element is Found 2");
        else System.out.println("Element is not Found ");

    }
}