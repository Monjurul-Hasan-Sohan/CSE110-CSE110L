// Task1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        int i = 0;
        while (i < arraySize) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Enter another number: ");
        int additionalNumber = scanner.nextInt();
        int[] newArray = new int[arraySize + 1];
        for (int j = 0; j < arraySize; j++) {
            newArray[j] = numbers[j];
        }
        newArray[arraySize] = additionalNumber;
        System.out.println("The elements of the array are:");
        for (int j = 0; j < arraySize; j++) {
            System.out.println(j + ": " + numbers[j]);
        }
        System.out.println("After resizing the array:");
        int k = 0;
        while (k < newArray.length) {
            System.out.print(newArray[k] + " ");
            k++;
        }
    }
}

// Task2
public class Main {
    public static void main(String[] args) {
        int[] array = {9, -5, 7, 9, -5, 5, 7};
        System.out.println("Before removing duplicates:");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] == array[k] && array[j] != 0) {
                    array[k] = 0;
                }
            }
        }
        System.out.println("\nAfter replacing duplicates with 0:");
        int m = 0;
        while (m < array.length) {
            System.out.print(array[m] + " ");
            m++;
        }
    }
}

// Task3
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt(); 
        int[] originalArray = new int[length];
        int i = 0;
        while (i < length) {
            System.out.print("Enter a number: ");
            originalArray[i] = scanner.nextInt();
            i++;
        }
        int[] reversedArray = new int[length];
        for (int j = 0; j < length; j++) {
            reversedArray[j] = originalArray[length - 1 - j];
        }       
        System.out.println("Reversed using a new array:");
        int k = 0;
        while (k < length) {
            System.out.print(reversedArray[k] + " ");
            k++;
        }
        int left = 0;
        int right = length - 1;
        while (left < right) {
            int temp = originalArray[left];
            originalArray[left] = originalArray[right];
            originalArray[right] = temp;
            left++;
            right--;
        }
        System.out.println("\nReversed the original array:");
        for (int j = 0; j < length; j++) {
            System.out.print(originalArray[j] + " ");
        }
    }
}

// Task4
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("N = ");
        int size = scanner.nextInt();        
        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            array[i] = scanner.nextInt();
            i++;
        }        
        System.out.println("Original array:");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + " ");
        }        
        int k = 0;
        while (k < size) {
            if (array[k] > 0) {
                array[k] = 1;
            } else if (array[k] < 0) {
                array[k] = 0;
            }
            k++;
        }
        System.out.println("\nAfter modifying:");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + " ");
        }
    }
}

// Task5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
            i++;
        }
        int searchValue = scanner.nextInt();
        boolean found = false;
        for (int j = 0; j < size; j++) {
            if (array[j] == searchValue) {
                System.out.println(searchValue + " is at index " + j);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}

// Task6
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        double[] numbers = new double[length];
        int i = 0;
        while (i < length) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextDouble();
            i++;
        }
        double max = numbers[0];
        int maxIndex = 0;
        double min = numbers[0];
        int minIndex = 0;
        double sum = 0;
        for (int j = 0; j < length; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
                maxIndex = j;
            }
            if (numbers[j] < min) {
                min = numbers[j];
                minIndex = j;
            }
            sum += numbers[j];
        }
        System.out.println("Maximum element " + max + " found at index " + maxIndex);
        System.out.println("Minimum element " + min + " found at index " + minIndex);
        System.out.println("Summation: " + sum);
        System.out.println("Average: " + (sum / length));
    }
}

// Task7
public class UniqueArray {
    public static void main(String[] args) {
        int[] inputArray = {23, 100, 23, 56, 100};
        int size = inputArray.length;
        int[] uniqueArray = new int[size];
        int uniqueIndex = 0;
        int i = 0;
        while (i < size) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueIndex; j++) {
                if (inputArray[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[uniqueIndex] = inputArray[i];
                uniqueIndex++;
            }
            i++;
        }
        System.out.print("Input array:\n");
        for (int j = 0; j < size; j++) {
            System.out.print(inputArray[j] + " ");
        }

        System.out.print("\nNew array:\n");
        for (int j = 0; j < uniqueIndex; j++) {
            System.out.print(uniqueArray[j] + " ");
        }
    }
}

// Task8
import java.util.Scanner;
public class SubsetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int array1Length = scanner.nextInt();
        int[] array1 = new int[array1Length];
        System.out.println("Please enter the elements of the arr1:");
        int i = 0;
        while (i < array1Length) {
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Please enter the length of array 2: ");
        int array2Length = scanner.nextInt();
        int[] array2 = new int[array2Length];
        System.out.println("Please enter the elements of the arr2:");
        for (int j = 0; j < array2Length; j++) {
            array2[j] = scanner.nextInt();
        }
        boolean isSubset = true;
        int k = 0;
        while (k < array2Length) {
            boolean found = false;
            for (int m = 0; m < array1Length; m++) {
                if (array2[k] == array1[m]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                isSubset = false;
                break;
            }
            k++;
        }

        if (isSubset) {
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }
    }
}

// Task9
import java.util.Scanner;
public class DescendingSelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        int i = 0;
        while (i < length) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Original Array:");
        int j = 0;
        while (j < length) {
            System.out.print(array[j] + " ");
            j++;
        }
        System.out.println();
        for (int k = 0; k < length - 1; k++) {
            int maxIndex = k;
            for (int m = k + 1; m < length; m++) {
                if (array[m] > array[maxIndex]) {
                    maxIndex = m;
                }
            }
            if (maxIndex != k) {
                int temp = array[k];
                array[k] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }
        System.out.println("Sorted Array:");
        int n = 0;
        while (n < length) {
            System.out.print(array[n] + " ");
            n++;
        }
    }
}

// Task10
import java.util.Scanner;
public class SortMarksAndNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        int[] marks = new int[numberOfStudents];
        String[] names = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.next();
        }
        // Bubble sort
        for (int i = 0; i < numberOfStudents - 1; i++) {
            for (int j = 0; j < numberOfStudents - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int tempMark = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = tempMark;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
