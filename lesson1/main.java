
public class Main {
    public static void main(String[] args) {
        // here we write code
// Print method
        System.out.print("Hello World!"); // After the this data, other data printed without space on the terminal and show in one line
        System.out.println("Hello World!"); // After the this data, other data printed with new line on the terminal
        System.out.print("Hello World!");

        /*  Output:
            Hello World!Hello World!
            Hello World!
         */

        System.out.println("\n____________________________________\n");
// Operators

        int numOne = 15;
        int numTwo = 4;

        int result = numOne + numTwo;
        int resultTwo = numOne - numTwo;

        System.out.println(result); // print 19 | 15 + 4 = 19
        result++;  // method 20 | 15 + 4 = 19 +1
        System.out.println(result);  // print 20 | 15 + 4 = 19 +1
        System.out.println(resultTwo);
        System.out.println(numOne * numTwo);

        int num1 = 20;
        num1 *= 2;
        num1 -= 5;
        num1 /= 3;
        System.out.println(result);

        System.out.println("\n____________________________________\n");
// if / else Operators
        /*
        STRUCTURE CODE:
           ```
            if (condition) {
                // code to execute if condition is true
            } else {
                // code to execute if condition is false
            }
           ```
        */
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        /*
        STRUCTURE CODE:
           ```
            switch (variable) {
                case value1:
                    // code to execute if variable equals value1
                    break;
                case value2:
                    // code to execute if variable equals value2
                    break;
                default:
                    // code to execute if no cases match
            }
           ```
        */

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        System.out.println("\n____________________________________\n");

// LOOP

        /*
        STRUCTURE CODE:
            ```
            for (initialization; condition; update) {
             // code to be executed
            }
            ```
         */

        // For loop that prints numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        System.out.println("\n____________________________________\n");
     }
        public int addNumbers(int a, int b) {
            int sum = a + b; // Method body
            return sum; // Return statement

    }
}