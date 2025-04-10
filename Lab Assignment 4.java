//Task01
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userINPUT = new Scanner(System.in);
        System.out.print("positive integer num: ");
        int totalPrimeCount = userINPUT.nextInt();

        int found_Primes = 0;
        
        for (int NumToCheck = 2; found_Primes < totalPrimeCount; NumToCheck = NumToCheck + 1) {
            boolean isPrimeNUMBER = true;

            for (int divIDEr = 2; divIDEr * divIDEr <= NumToCheck; divIDEr = divIDEr + 1) {
                if (NumToCheck % divIDEr == 0) {
                    isPrimeNUMBER = false;
                    break;
                }
            }

            if (isPrimeNUMBER) {
                System.out.println(NumToCheck);
                found_Primes = found_Primes + 1;
            }
        }
    }
}














//Task02
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userINPUT = new Scanner(System.in);
        System.out.print("entr N: ");
        int userNUMBER = userINPUT.nextInt();

        int totalSUM = 0;
        int sumSERIES = 0;

        for (int currentNUMBER = 1; currentNUMBER <= userNUMBER; currentNUMBER = currentNUMBER + 1) {
            sumSERIES = sumSERIES + currentNUMBER;
            totalSUM = totalSUM - sumSERIES;
        }

        System.out.println("The value of y: " + totalSUM);
    }
}














//Task03

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userINPUT = new Scanner(System.in);

        while (true) {
            System.out.print("enter jekono number");
            int userNUMBER = userINPUT.nextInt();

            if (userNUMBER % 2 != 0) {
                break;
            }

            int divisorCOUNT = 0;

            for (int currentNUMBER = 1; currentNUMBER <= userNUMBER; currentNUMBER = currentNUMBER + 1) {
                if (userNUMBER % currentNUMBER == 0) {
                    divisorCOUNT = divisorCOUNT + 1;
                }
            }

            System.out.println(userNUMBER + " has " + divisorCOUNT + " divisors");
        }
    }
}













//task4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usrIN = new Scanner(System.in);
        int usrTestCaseCount = usrIN.nextInt();

        for (int usrLoop = 0; usrLoop < usrTestCaseCount; usrLoop++) {
            int usrXvalue = usrIN.nextInt();
            int usrYvalue = usrIN.nextInt();
            int usrCount = 0;
            int usrSum = 0;

            if (usrXvalue % 2 == 0) {
                usrXvalue++;
            }

            for (int usrCurrent = usrXvalue; usrCount < usrYvalue; usrCurrent += 2) {
                usrSum += usrCurrent;
                usrCount++;
            }

            System.out.println(usrSum);
        }
    }
}














//task5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usrIN = new Scanner(System.in);
        int recWidth = usrIN.nextInt();
        int recLength = usrIN.nextInt();

        for (int i = 1; i <= recLength; i++) {
            for (int j = 1; j <= recWidth; j++) {
                System.out.print(j);
                if (j < recWidth) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

















//task6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usrIN = new Scanner(System.in);

        System.out.println("KOyta number dite chaw");
        int howManyUsrInput = usrIN.nextInt();

        int usrMaxEven = 0;
        int usrMinEven = 0;
        int usrEvenSum = 0;
        int usrEvenCount = 0;

        int usrGot = 0;
        while (usrGot < howManyUsrInput) {
            if (usrIN.hasNextInt()) {
                int usrVal = usrIN.nextInt();
                usrGot++;

                if (usrVal > 0 && usrVal % 2 == 0) {
                    if (usrEvenCount == 0) {
                        usrMaxEven = usrVal;
                        usrMinEven = usrVal;
                    } else {
                        if (usrVal > usrMaxEven) {
                            usrMaxEven = usrVal;
                        }
                        if (usrVal < usrMinEven) {
                            usrMinEven = usrVal;
                        }
                    }
                    usrEvenSum += usrVal;
                    usrEvenCount++;
                }
            } else {
                usrIN.next(); // skip invalid input
            }
        }

        int usrEvenAvg = 0;
        if (usrEvenCount > 0) {
            usrEvenAvg = usrEvenSum / usrEvenCount;
            System.out.println("Max: " + usrMaxEven);
            System.out.println("Min: " + usrMinEven);
        } else {
            System.out.println("Max: 0");
            System.out.println("Min: 0");
        }

        System.out.println("Average: " + usrEvenAvg);
    }
}


















//task7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usrIN = new Scanner(System.in);

        while (true) {
            System.out.print("jekono random numder input daw: ");
            int usrNumber = usrIN.nextInt();

            if (usrNumber < 0) {
                break;
            }

            int usrSquare = usrNumber * usrNumber;
            System.out.println(usrNumber + " ^ 2 = " + usrSquare);
        }
    }
}


























//task8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usrIN = new Scanner(System.in);

        System.out.print("Start: ");
        int usrRangeStart = usrIN.nextInt();
        System.out.print("End: ");
        int usrRangeEnd = usrIN.nextInt();

        System.out.println("Armstrong nums in...........");
        for (int usrNum = usrRangeStart; usrNum <= usrRangeEnd; usrNum++) {
            int usrDigitCount = 0;
            int usrTemp = usrNum;

            // count digits 
		while (usrTemp != 0) {
                usrDigitCount++;
                usrTemp /= 10;
            }

            usrTemp = usrNum;
            int usrSum = 0;

            // calc amstrong sum 
		while (usrTemp != 0) {
                int usrDigit = usrTemp % 10;
                int usrPower = 1;
                for (int i = 0; i < usrDigitCount; i++) {
                    usrPower *= usrDigit;
                }
                usrSum += usrPower;
                usrTemp /= 10;
            }

            if (usrSum == usrNum) {
                System.out.println(usrNum);
            }
        }
    }
}
