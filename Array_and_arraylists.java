public class ArrayFunctions {

    public static void separateEvenOdd(int[] numbers) {
        int[] even = new int[numbers.length];
        int[] odd = new int[numbers.length];
        int evenIndex = 0, oddIndex = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                even[evenIndex++] = num;
            } else {
                odd[oddIndex++] = num;
            }
        }

        // Print the even and odd arrays
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }
