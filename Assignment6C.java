import java.util.Scanner;
import java.util.Random;
public class Assignment6C {
    public static void display(char[][] arr, int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("[Minesweeper - DOS Edition]");
        System.out.print("What is the grid size? ");
        int size = scan.nextInt();
        char[][] arr = new char[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                arr[i][j] = '?';
        }
        int[] mine = new int[size];
        Random rand = new Random();
        for(int i=0;i<size;i++){
            mine[i] = rand.nextInt(size);
        }
        int win = 1,count = 0;
        while(true){
            display(arr, size);
            System.out.print("Enter your X coordinate: ");
            int x = scan.nextInt();
            System.out.print("Enter your Y coordinate: ");
            int y = scan.nextInt();
            if(mine[y]==x){
                win = 0;
                arr[x][y] = 'X';
                break;
            }
            count++;
            arr[x][y] = '_';
            if(count==size){
                break;
            }
            System.out.println();
        }
        System.out.println();
        display(arr, size);
        if(win == 1){
            System.out.print("You win!");
        }
        else{
            System.out.print("Sorry, you hit a mine!");
        }
        scan.close();
    }
}