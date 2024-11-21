package hello;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); 
        }
        
        System.out.print("Enter the target to search: ");
        int target = sc.nextInt();
        int first = 0;
        int last = size - 1;
        boolean found = false;
        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (arr[mid] == target) {
                System.out.println(target + " is found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] > target) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        if (!found) {
            System.out.println(target + " is not found in the array.");
        }
	}

}
