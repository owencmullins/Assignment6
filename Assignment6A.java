import java.util.Random;
public class Assignment6A {
    public static int linear(int[] array, int target)
    {
        int count = 0;
        for (int j : array) {
            count += 1;
            if (j == target) {
                break;
            }
        }
        return count;
    }
    public static int binary(int[] array, int target)
    {
        int guess = 0, low = 0, high = array.length-1;
        while(low<=high)
        {
            int mid = low + ((high-low)/2);
            guess += 1;
            if(array[mid]<target) { low = mid+1; }
            else if(array[mid]>target) { high = mid-1; }
            else if(array[mid]==target)
            {
                break;
            }
        }
        return guess;
    }
    public static void main(String[] args)
    {
        int size = 1000000;
        int[] array = new int[size];
        for(int i=0; i<size; i++) { array[i] = i; }
        Random rand = new Random();
        int target = rand.nextInt(size);
        int ls = linear(array,target);
        int bs = binary(array,target);
        System.out.println("\nComparing Linear Search and Binary Search:");
        System.out.println("Our target is "+target);
        System.out.println("Linear Search: "+ls+" loop(s)");
        System.out.println("Binary Search: "+bs+" guess(es)");
        if(ls>bs) { System.out.println("Binary Search is faster this time!"); }
        else { System.out.println("Linear Search is faster this time!"); }
    }
}
