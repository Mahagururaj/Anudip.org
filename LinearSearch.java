package myapp;
import java.util.Scanner;
public class LinearSearch{

    public static void main(String[] args) {
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

        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Value is found at index " + i + " " + "target value is"+" "+arr[i]);
                isFound = true;
                break; 
            }
        }
        
        if (!isFound) {
            System.out.println("Value is not found in the array.");
        }
    }
}
