//10
a) hungry     - Valid
b) 2AB        - Invalid        ...cannot start with a number
c) 312.2      - Invalid        ...contains a decimal point
d) MOBILE     - Valid
e) “Ans”      - Invalid        ...quotation marks are for strings
f) $30        - Valid
g) Yes/No     - Invalid        ...contains a slash
h) student-id - Invalid        ...contains a hyphen
i) A+3        - Invalid        ...contains a plus sign
j) ‘X’        - Invalid        ...single quotes are for characters
k) return     - Invalid        ...reserved keyword




//11
public class main {
    public static void main(String[] args) {

        // Ex2.1
        int num1 = 90;
        System.out.println("1st number is: " + num1);

        // Ex2.2
        int num2 = 6;
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        // Ex2.3
        int num1_x_num2 = num1 * num2;
        int num1_by_num2 = num1 / num2;
        System.out.println("The product is: " + num1_x_num2);
        System.out.println("The division is: " + num1_by_num2);

        // Ex2.4
        double num3 = 45.5;
        double num4 = 10.2;
        double sumDouble = num3 + num4;
        System.out.println("The sum of num3 and num4 is: " + sumDouble);

        double productDouble = num3 * num4;
        double divisionDouble = num3 / num4;
        System.out.println("The product of num3 and num4 is: " + productDouble);
        System.out.println("The division of num3 by num4 is: " + divisionDouble);

        // Ex2.5
        double result1 = num3 + num1;
        double result2 = num3 * num2;
        double result3 = num3 / num2;
        System.out.println("The result of num3 + num1 is: " + result1);
        System.out.println("The result of num3 * num2 is: " + result2);
        System.out.println("The result of num3 / num2 is: " + result3);

        // Ex2.6
        String str1 = "Hello";
        String str2 = "World";
        String strSum = str1 + str2;
        System.out.println("The concatenation of str1 and str2 is: " + strSum);

        String mixedSum1 = num1 + str1;
        System.out.println("The result of num1 + str1 is: " + mixedSum1);

        String mixedSum2 = str1 + num1;
        System.out.println("The result of str1 + num1 is: " + mixedSum2);
    }
}







//12
public class Main {
    public static void main(String[] args) {
      
        double radius = 4;
        
        double circumference = 2 * Math.PI * radius;
        System.out.println("circumference: " + circumference);

        
        double area = Math.PI * radius * radius;
      System.out.println("area: " + area);
    }
}








//13
public class Main {
    public static void main(String[] args) {

        int number = 987654321;
        int num = number % 100;
        System.out.println("last 2 digits: " + num);
    }
}







//14
public class Main {
    public static void main(String[] args) {
      
        
        int inch = 1000;
        
        double meters = inch * 0.0254;  // formula
        System.out.println(inch + " inch is " + meters + " meters");
    }
}







//15
public class Main {
    public static void main(String[] args) {
      
        int a = 31416;  
        int b = 22222; 
        
        
        int temp = a;  
        a = b;          
        b = temp;       
        System.out.println("After swapping: a = " + a + ", b = " + b);

       
        
        //reset a and b
        a = 31416;  
        b = 22222; 
        
        a = a + b;  
        b = a - b;  
        a = a - b;  
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}







//16
public class Main {
    public static void main(String[] args) {

        
        int min = 3456789;
        
        
        int minutesInYear = 60 * 24 * 365;
        int minutesInDay = 60 * 24;
        
        int years = min / minutesInYear;      
        int remainingMinutes = min % minutesInYear; 
        int days = remainingMinutes / minutesInDay;  
        
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days.");
    }
}






//17
public class Main {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int c = 8;

        int d = (2 * b * ((c - a) / 3)) + 7;

        System.out.println("The value is: " + d);
    }
}







//18
public class Main {
    public static void main(String[] args) {

        int studentId = 1000054254;

        int lastTwoDigits = studentId % 100;

        int firstDigit = lastTwoDigits / 10;
        int secondDigit = lastTwoDigits % 10;

        System.out.println(secondDigit + ", " + firstDigit);
    }
}







//19
public class Main {
    public static void main(String[] args) {

        double a = 8;
        double b = 3;

        double oneSide = Math.sqrt(Math.pow(a / 2.0, 2) + Math.pow(b, 2));


        double circumference = oneSide * 6;

        double area = (3 * Math.sqrt(3) / 2) * Math.pow(oneSide, 2);

        System.out.println("Circumference of the hexagon: " + circumference);
        System.out.println("Area of the hexagon: " + area);
    }
}






//20
public class Main {
    public static void main(String[] args) {

        double a = 4.5;
        double b = 9.5;

        //Pythagorean theorem
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        
        double sinA = a / c;
        double cosA = b / c;
        double sinB = b / c;
        double cosB = a / c;

        System.out.println("Sin(A) = " + sinA);
        System.out.println("Cos(A) = " + cosA);
        System.out.println("Sin(B) = " + sinB);
        System.out.println("Cos(B) = " + cosB);
    }
}

