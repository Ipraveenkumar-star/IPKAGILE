import java.util.Scanner; // Needed to read input from the console

 class FactorialCalculator {

    public static void main(String[] args) {
        
        // 1. Setup scanner to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        
        // 2. Check if the user entered a valid integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            if (number < 0) {
                System.out.println("Error: Factorial is not defined for negative numbers.");
            } else {
                // 3. Call the calculation method
                long result = calculateFactorial(number);
                
                // 4. Print the result
                System.out.printf("The factorial of %d is: %d\n", number, result);
            }
            
        } else {
            System.out.println("Invalid input. Please enter a whole number.");
        }
        
        // Always close the scanner to prevent resource leaks
        scanner.close();
    }

    /**
     * Calculates the factorial of a given integer using a loop.
     */
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long factorial = 1; 
        
        // Use a for loop to multiply factorial by every number from 1 up to n
        for (int i = 2; i <= n; i++) {
            factorial *= i; // Equivalent to: factorial = factorial * i;
        }
        
        return factorial;
    }
}