//Task_1
import java.util.Scanner;  
public class Main {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  

        System.out.println("Enter three numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int largest = num1;  

        if (num2 > largest) {  
            largest = num2;  
        }  
        if (num3 > largest) {  
            largest = num3;  
        }  
        System.out.println("Largest number: " + largest);  
    }  
}


//Task_2

import java.util.Scanner;  

public class Main {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Enter the student's score:");
        int score = sc.nextInt();
        
        String grade;
        
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 85 && score <= 89) {
            grade = "A-";
        } else if (score >= 70 && score <= 84) {
            grade = "B";
        } else if (score >= 57 && score <= 69) {
            grade = "C";
        } else if (score >= 50 && score <= 56) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Your grade is " + grade);  
    }  
}



//Task_3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("Divisible by Both");
        } else if (num % 5 == 0) {
            System.out.println("Invalid: Divisible by 5 Only");
        } else if (num % 7 == 0) {
            System.out.println("Invalid: Divisible by 7 Only");
        } else {
            System.out.println("No");
        }
    }
}


//Task4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}



//Task5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Number is negative");
        } else if (num == 0) {
            System.out.println("Number is zero");
        } else {
            if (num % 2 == 0) {
                System.out.println("Number is positive and even");
            } else {
                System.out.println("Number is positive and odd");
            }
        }
    }
}


//Task6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        if (x < 0) {
            System.out.println("Output: " + (2 * x));
        } else if (x >= 0 && x < 2) {
            System.out.println("Output: " + (x + 1));
        } else if (x >= 2 && x < 5) {
            System.out.println("Output: " + (x * x - 1));
        } else if (x >= 5) {
            System.out.println("Output: " + (3 * x * x + 2));
        }
    }
}


//Task7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your payment amount:");
        int payment = sc.nextInt();

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        
        if (age < 18) {
            System.out.println("Your tax amounts in 0 Tk");
        } else {
            if (payment < 10000) {
                System.out.println("Your tax amounts in 0 Tk");
            } else if (payment >= 10000 && payment <= 20000) {
                double tax = payment * 0.05;
                System.out.println("Your tax amounts in " + tax + " Tk");
            } else {
                double tax = payment * 0.10;
                System.out.println("Your tax amounts in " + tax + " Tk");
            }
        }
    }
}



//Task8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        float num1 = sc.nextFloat();

        System.out.println("Enter second number:");
        float num2 = sc.nextFloat();

        System.out.println("Enter third number:");
        float num3 = sc.nextFloat();

        float max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        float min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}



//Task9
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side: ");
        int side1 = sc.nextInt();

        System.out.println("Enter side: ");
        int side2 = sc.nextInt();

        System.out.println("Enter side: ");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("This is an Equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("This is an Isosceles triangle");
        } else {
            System.out.println("This is a Scalene triangle");
        }
    }
}




//Task10
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Amount to pay: ");
        int amountToPay = sc.nextInt();
        
        System.out.print("Amount given: ");
        int amountGiven = sc.nextInt();
        
        if (amountGiven >= amountToPay) {
            int change = amountGiven - amountToPay;
            System.out.println("Returned: " + change + " taka");
            
            int note100 = change / 100;
            change = change % 100;
            int note50 = change / 50;
            change = change % 50;
            int note20 = change / 20;
            change = change % 20;
            int note10 = change / 10;
            change = change % 10;
            int coin5 = change / 5;
            change = change % 5;
            int coin2 = change / 2;
            change = change % 2;
            int coin1 = change / 1;
            change = change % 1;
            
            System.out.println("100 taka note: " + note100);
            System.out.println("50 taka note: " + note50);
            System.out.println("20 taka note: " + note20);
            System.out.println("10 taka note: " + note10);
            System.out.println("5 taka coin: " + coin5);
            System.out.println("2 taka coin: " + coin2);
            System.out.println("1 taka coin: " + coin1);
        } else {
            int amountNeeded = amountToPay - amountGiven;
            System.out.println("Pay " + amountNeeded + " taka more.");
        }
    }
}



//Task11
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input the 1st number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Input the 2nd number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Input the 3rd number: ");
        int num3 = sc.nextInt();
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal nor different");
        }
    }
}

