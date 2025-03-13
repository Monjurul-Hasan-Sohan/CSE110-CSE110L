//Task:01
public class Task01{
    public static void main(String[] args) {

        //for a
        System.out.println("Sequence a:");
        int a = 24;
        while (a >= -6) {  
            System.out.print(a + " ");  
            a = a - 6; 
        }
        System.out.println("\n");

        
        //for b
        System.out.println("Sequence b:");
        int b = 18;
        int count = 0;  
        while (count < 6) {  
            System.out.print(b + " ");  
            if (b > 0) { 
                b = (b * -1) - 9;  
            } else { 
                b = (b * -1) + 9;  
            }
            count = count + 1;
        }
    }
}








//Task02:
import java.util.Scanner;  

public class Task02{  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter N: ");  
        int N = sc.nextInt();  
        int sum = 0;  
        System.out.println("Input the " + N + " numbers: ");  

        for (int incriment = 0; incriment < N; incriment++) {  
            int num = sc.nextInt();  
            sum = sum + num;  
        }  
        double avg = (double) sum / N;  
        System.out.println("The sum of " + N + " no is: " + sum);  
        System.out.println("The Average is: " + avg);  
    }  
}









//Task03:
public class Task03{  
    public static void main(String[] args) {  
        int sum = 0;  

        for (int num = 1; num <= 600; num++) {  
            if (num % 7 == 0 && num % 9 == 0) {  
                sum = sum + num;  
            }  
        }  

        System.out.println("ans: " + sum);  
    }  
}








//Task04:
public class Task04{  
    public static void main(String[] args) {  
        int sum = 0;  

        for (int num = 1; num <= 600; num++) {  
            if (num % 7 == 0 || num % 9 == 0) {  
                sum = sum + num;  
            }  
        }  

        System.out.println("ans: " + sum);  
    }  
}







//Task05:
public class Task05{  
    public static void main(String[] args) {  
        int sum = 0;  

        for (int num = 1; num <= 600; num++) {  
            if ((num % 7 == 0 || num % 9 == 0) && !(num % 7 == 0 && num % 9 == 0)) {  
                sum = sum + num;  
            }  
        }  

        System.out.println("ans: " + sum);  
    }  
}







//Task06:
import java.util.Scanner;  

public class Main {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Enter n: ");  
        int n = sc.nextInt();  
        int y = 0;  

        for (int num = 1; num <= n; num++) {  
            if (num % 2 == 0) {  
                y = y - (num * num);  
            } else {  
                y = y + (num * num);  
            }  
        }  

        System.out.println("The value of y is: " + y);  
    }  
}







//Task07:
import java.util.Scanner;  

public class Main {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Enter a positive integer n: ");  
        int n = sc.nextInt();  

        for (int num = 0; num <= n; num++) {  
            if (num % 5 == 0 && num % 3 != 0) {  
                System.out.println(num);  
            }  
        }  
    }  
}








//Task08:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();

            if (num < 0) {
                break;
            }

            System.out.println(num + " ^ 2 = " + (num * num));
        }
    }
}








//Task09:
import java.util.Scanner;

public class Task09{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        int nonNegativeCount = 0;
        int negativeCount = 0;

        for (int incriment = 1; incriment <= n; incriment++) {
            System.out.print("Enter number " + incriment + ": ");
            int num = sc.nextInt();

            if (num >= 0) {
                nonNegativeCount++;
            } else {
                negativeCount++;
            }
        }

        System.out.println("Non-negative numbers: " + nonNegativeCount);
        System.out.println("Negative numbers: " + negativeCount);
    }
}









//Task10:
import java.util.Scanner;

public class Task10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int n = sc.nextInt();

        int sum = 0;
        int oddNumber = 1;
        int increment = 1;

        while (increment <= n) {
            System.out.println(oddNumber);
            sum = sum + oddNumber;
            oddNumber = oddNumber + 2;
            increment = increment + 1;
        }

        System.out.println("The Sum of odd Natural Numbers up to " + n + " terms is: " + sum);
    }
}









//Task11:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            sum = sum + num;
            System.out.println("Sum = " + sum);
        }
    }
}









//Task12:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Divisors of " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
			








//Task13:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int digitCount = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            digitCount++;
        }

        System.out.println("Total digits = " + digitCount);
    }
}









//Task14:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number / 10;
        }
    }
}








//Task15:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        int temp = number;
        int digits = 0;

        // Count number of digits
        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }

        // Calculate the divisor
        int divisor = 1;
        for (int i = 1; i < digits; i++) {
            divisor = divisor * 10;
        }

        // Print digits from left to right
        while (divisor != 0) {
            int digit = number / divisor;
            System.out.print(digit + " ");
            number = number % divisor;
            divisor = divisor / 10;
        }
    }
}







//Task16:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
        // Check prime
        boolean prime = true;
        if (n <= 1) {
            prime = false; // 1 or less not prime
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false; // Not prime
                    break;
                }
            }
        }
        
        if (prime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }

        // Check perfect
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i; // Add divisors
            }
        }

        if (sum == n) {
            System.out.println(n + " is perfect");
        } else {
            System.out.println(n + " is not perfect");
        }
    }
}

