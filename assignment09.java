//Task1:
import java.util.Scanner;

public class Main {

    // A
    public static void oneToN(int i, int N) {
        if (i > N) {
            return;
        }
        System.out.print(i + " ");
        oneToN(i + 1, N);
    }

    // B
    public static void nToOne(int i, int N) {
        if (N < i) {
            return;
        }
        System.out.print(N + " ");
        nToOne(i, N - 1);
    }

    // C
    public static int recursiveSum(int i, int N) {
        if (i > N) {
            return 0;
        }
        return i + recursiveSum(i + 1, N);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;

        // A
        System.out.print("Enter value for N (oneToN): ");
        N = input.nextInt();
        System.out.print("Output: ");
        oneToN(1, N);
        System.out.println();

        // B
        System.out.print("Enter value for N (nToOne): ");
        N = input.nextInt();
        System.out.print("Output: ");
        nToOne(1, N);
        System.out.println();

        // C
        System.out.print("Enter value for N (recursiveSum): ");
        N = input.nextInt();
        int sum = recursiveSum(1, N);
        System.out.println("Sum is: " + sum);
    }
}





//Task 2:
import java.util.Scanner;

public class Main {

    // Recursive method
    public static void reverseDigits(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n % 10); //last digit
        reverseDigits(n / 10);      // remove last digit
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n == 0) {
            System.out.println(0);
        } else {
            reverseDigits(n);
        }
    }
}




//Task 3:
import java.util.Scanner;

public class Main {

    // Recursive method
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int result = sumDigits(n);
        System.out.println("Sum of digits: " + result);
    }
}



//Task4:
import java.util.Scanner;
public class Main {

    //reverse a string
public class Main {
    public static void main(String[] args) {
        
    }
}    public static String reverse_string(String s, int index) {
        if (index == s.length()) {
            return "";
        }
        return reverse_string(s, index + 1) + s.charAt(index);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        String reversed = reverse_string(s, 0);
        System.out.println("Reversed string: " + reversed);
    }
}




//Task5:
import java.util.Scanner;
public class Main {

    //calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int result = factorial(n);
        System.out.println("Factorial: " + result);
    }
}


//Task6: 
import java.util.Scanner;
public class Main {

    // calculate base^exponent
    public static long power(long base, long exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        long base = input.nextLong();
        System.out.print("Enter exponent: ");
        long exponent = input.nextLong();
        long result = power(base, exponent);
        System.out.println("Result: " + result);
    }
}


//Task7:
import java.util.Scanner;

public class Main {

    //print elements from index to end
    public static void print_elements(int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        System.out.println(arr[index]);
        print_elements(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //array input
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter starting index: ");
        int index = input.nextInt();
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
        } else {
            System.out.println("Elements from index " + index + ":");
            print_elements(arr, index);
        }
    }
}


//Task8:
import java.util.Scanner;
public class Main {

    //Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = input.nextInt();
        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
