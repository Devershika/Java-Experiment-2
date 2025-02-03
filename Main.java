// Main.java
//Name : Devershika Mohane
//PRN:23070126032
//Batch : A2 AIML
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nChoose a functionality:");
        System.out.println("1. Separate even and odd numbers");
        System.out.println("2. Find the two neighboring numbers with the smallest distance");
        int choice = sc.nextInt();
