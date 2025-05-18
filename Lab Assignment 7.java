// Task1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int size = scanner.nextInt();
        int[] originalArray = new int[size];
        int index = 0;
        while (index < size) {
            System.out.print("Enter a number: ");
            originalArray[index] = scanner.nextInt();
            index++;
        }
        System.out.print("Enter another number: ");
        int extraNumber = scanner.nextInt();
        int[] resizedArray = new int[size + 1];
        for (int i = 0; i < size; i++) {
            resizedArray[i] = originalArray[i];
        }
        resizedArray[size] = extraNumber;
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + originalArray[i]);
        }
        System.out.println("After resizing the array:");
        int pointer = 0;
        while (pointer < resizedArray.length) {
            System.out.print(resizedArray[pointer] + " ");
            pointer++;
        }
    }
}

// Task2
public class Main {
    public static void main(String[] args) {
        int[] numbers = {9, -5, 7, 9, -5, 5, 7};
        System.out.println("Before removing duplicates:");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && numbers[i] != 0) {
                    numbers[j] = 0;
                }
            }
        }
        System.out.println("\nAfter replacing duplicates with 0:");
        for (int value : numbers) {
            System.out.print(value + " ");
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
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        int[] reversedArray = new int[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }       
        System.out.println("Reversed using a new array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        int left = 0;
        int right = length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println("\nReversed the original array:");
        for (int num : array) {
            System.out.print(num + " ");
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
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }        
        System.out.println("Original array:");
        for (int value : array) {
            System.out.print(value + " ");
        }        
        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                array[i] = 1;
            } else if (array[i] < 0) {
                array[i] = 0;
            }
        }
        System.out.println("\nAfter modifying:");
        for (int value : array) {
            System.out.print(value + " ");
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
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                System.out.println(target + " is at index " + i);
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
        for (int i = 0; i < length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextDouble();
        }
        double max = numbers[0], min = numbers[0], sum = 0;
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
            sum += numbers[i];
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
        int[] original = {23, 100, 23, 56, 100};
        int length = original.length;
        int[] unique = new int[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (original[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unique[uniqueCount] = original[i];
                uniqueCount++;
            }
        }
        System.out.print("Input array:\n");
        for (int num : original) {
            System.out.print(num + " ");
        }

        System.out.print("\nNew array:\n");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}

// Task8
import java.util.Scanner;
public class SubsetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int length1 = scanner.nextInt();
        int[] array1 = new int[length1];
        System.out.println("Please enter the elements of the arr1:");
        for (int i = 0; i < length1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Please enter the length of array 2: ");
        int length2 = scanner.nextInt();
        int[] array2 = new int[length2];
        System.out.println("Please enter the elements of the arr2:");
        for (int i = 0; i < length2; i++) {
            array2[i] = scanner.nextInt();
        }
        boolean isSubset = true;
        for (int i = 0; i < length2; i++) {
            boolean found = false;
            for (int j = 0; j < length1; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                isSubset = false;
                break;
            }
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
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Original Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        for (int i = 0; i < size - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }
        System.out.println("\nSorted Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

// Task10
import java.util.Scanner;
public class SortMarksAndNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int count = scanner.nextInt();
        int[] marks = new int[count];
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.next();
        }
        // Bubble sort
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
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
