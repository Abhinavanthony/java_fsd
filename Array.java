public class Array {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] numbers = new int[5];

        // Assign values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Access and print array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Calculate and print the sum of array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);

        // Array initialization with values
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Access and print array elements
        System.out.println("Array elements:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
