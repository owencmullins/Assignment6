import java.util.Scanner;
import java.util.Random;
public class Assignment6B {
    public static void insertion_sort(int[] array, int n){
        for (int i = 1; i < n; ++i) {
            int k = array[i];
            int t = i - 1;
            while (t >= 0 && array[t] > k) {
                array[t + 1] = array[t];
                t = t - 1;
            }
            array[t + 1] = k;
        }
        for(int i: array) {
            System.out.print(i + " ");
        }
    }
    public static void selection_sort(int[] array, int n)
    {
        for (int i = 0; i < n-1; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < n; j++)
                if (array[j] > array[minIndex])
                    minIndex = j;
            int tempValue = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tempValue;
        }
        for(int i: array) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("How large should the array be? ");
        int n = sc.nextInt();
        System.out.print("What should be the highest number in the sequence? ");
        int highestNum = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = rand.nextInt(highestNum + 1);
        }
        System.out.println();
        for(int i: a) {
            System.out.print(i + " ");
        }
        while(true) {
            System.out.println("\n\n[Options]");
            System.out.println("1) Reset the array\n2) Sort (Smallest to Largest)\n3) Sort (Largest to Smallest)\n4) Quit");
            System.out.print("Choice? ");
            int choice = sc.nextInt();
            if(choice == 1) {
                for(int i = 0; i < n; i++) {
                    a[i] = rand.nextInt(highestNum + 1);
                }
                for(int i: a) {
                    System.out.print(i + " ");
                }
            }else if(choice == 2) {
                System.out.println("\nUsing insertion sort: ");
                insertion_sort(a, n);
            }else if(choice == 3) {
                System.out.println("\nUsing selection sort: ");
                selection_sort(a, n);
            }else if (choice == 4){
                System.out.println("\nQuitting");
                break;
            }
        }
    }
}
