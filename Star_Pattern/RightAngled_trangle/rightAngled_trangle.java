// *
// **
// ***
// ****
// *****


public class rightAngled_trangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print '*' i times
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}