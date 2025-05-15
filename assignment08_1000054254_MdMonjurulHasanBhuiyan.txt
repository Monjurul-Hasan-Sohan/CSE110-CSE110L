//TAsk1

import java.util.Scanner;
public class Main {
    //evenChecker
    public static void evenChecker(int number) {
        if (number % 2 == 0) {
            System.out.println("Even!!");
        } else {
            System.out.println("Odd!!");
        }
    }
    //isEven
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    //isPos
    public static boolean isPos(int number) {
        return number > 0;
    }
    //sequence
    public static void sequence(int n) {
        if (isPos(n)) {
            for (int i = 0; i <= n; i++) {
                if (isEven(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = n; i < 0; i++) {
                if (!isEven(i)) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("evenChecker: ");
        int ecNum = scanner.nextInt();
        evenChecker(ecNum);
        System.out.print("isEven: ");
        int ieNum = scanner.nextInt();
        boolean isEvenResult = isEven(ieNum);
        System.out.println("isEven result: " + isEvenResult);
        System.out.print("isPos: ");
        int ipNum = scanner.nextInt();
        boolean isPosResult = isPos(ipNum);
        System.out.println("isPos result: " + isPosResult);
        System.out.print("Enter a number for sequence: ");
        int seqNum = scanner.nextInt();
        System.out.print("Sequence output: ");
        sequence(seqNum);
    }
}


//Task2
import java.util.Scanner;
public class Main {
    public static double circleArea(int radius) {
        double pi = 3.1416;
        return pi * radius * radius;
    }
    public static double sphereVolume(double radius) {
        double pi = 3.1416;
        return (4.0 / 3.0) * pi * radius * radius * radius;
    }
    public static void findSpace(int diameter, String shape) {
        int radius = diameter / 2;

        if (shape.equals("circle")) {
            double area = circleArea(radius);
            System.out.printf("Area of circle: %.4f\n", area);
        } else if (shape.equals("sphere")) {
            double volume = sphereVolume(radius);
            System.out.printf("Volume of sphere: %.4f\n", volume);
        } else {
            System.out.println("Wrong Parameter");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius to calculate circle area: ");
        int circleRadius = scanner.nextInt();
        double area = circleArea(circleRadius);
        System.out.printf("Circle Area: %.4f\n", area);
        System.out.print("Enter radius to calculate sphere volume: ");
        double sphereRadius = scanner.nextDouble();
        double volume = sphereVolume(sphereRadius);
        System.out.printf("Sphere Volume: %.4f\n", volume);
        System.out.print("Enter diameter for findSpace: ");
        int diameter = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter shape type (circle/sphere): ");
        String shape = scanner.nextLine();
        findSpace(diameter, shape);
    }
}



//TAsk3
import java.util.Scanner;
public class Main {
    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    public static void triArea(int a, int b, int c) {
        if (isTriangle(a, b, c)) {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("%.3f\n", area);
        } else {
            System.out.println("Can’t form triangle");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 sides to check isTriangle: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean result = isTriangle(a, b, c);
        System.out.println(result);
        System.out.print("triArea output: ");
        triArea(a, b, c);
    }
}



//Task4
import java.util.Scanner;
public class Main {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
            sum += i;
        }
        return sum == num;
    }
    public static int special_sum(int limit) {
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            if (isPrime(i) || isPerfect(i)) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("isPrime: ");
        int p = scanner.nextInt();
        boolean prime = isPrime(p);
        System.out.println(prime);
        
        System.out.print("isPerfect: ");
        int pe = scanner.nextInt();
        boolean perfect = isPerfect(pe);
        System.out.println(perfect);
        System.out.print("special_sum: ");
        int limit = scanner.nextInt();
        int result = special_sum(limit);
        System.out.println(result);
    }
}


//Task5
import java.util.Scanner;
public class Main {
    public static void showDots(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(".");
        }
    }

    public static void show_palindrome(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        for (int i = n - 1; i >= 1; i--) {
            System.out.print(i);
        }
    }

    public static void showDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            showDots(n - i);
            show_palindrome(i);
            showDots(n - i);
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            showDots(n - i);
            show_palindrome(i);
            showDots(n - i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for showDots: ");
        int d = scanner.nextInt();
        showDots(d);
        System.out.println();
        System.out.print("Enter number for show_palindrome: ");
        int p = scanner.nextInt();
        show_palindrome(p);
        System.out.println();
        System.out.print("Enter number for showDiamond: ");
        int dia = scanner.nextInt();
        showDiamond(dia);
    }
}


//task7

import java.util.Scanner;
public class Main {
    public static double calcTax(int age, double salary) {
        if (age < 18 || salary < 10000) {
            return 0.0;
        } else if (salary <= 20000) {
            return salary * 0.07;
        } else {
            return salary * 0.14;
        }
    }
    public static void calcYearlyTax() {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        double totalTax = 0;
        for (int month = 1; month <= 12; month++) {
            double salary = scanner.nextDouble();
            double tax = calcTax(age, salary);
            totalTax += tax;
            System.out.printf("Month%d tax: %.1f\n", month, tax);
        }
        System.out.printf("Total Yearly Tax: %.1f\n", totalTax);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age and salary to calculate single tax: ");
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();
        double tax = calcTax(age, salary);
        System.out.println(tax);
        System.out.println("Enter age followed by 12 monthly salaries:");
        calcYearlyTax();
    }
}
