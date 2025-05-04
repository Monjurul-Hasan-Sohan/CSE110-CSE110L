//task1

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = input.nextLine();
        int i = 0;
        while (i < text.length()) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }
            System.out.print(c);
            i++;
        }
        System.out.println();
    }
}


//task2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = input.nextLine();
        int i = text.length() - 1;
        while (i >= 0) {
            System.out.print(text.charAt(i));
            i--;
        }
        System.out.println();
    }
}


//task3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = input.nextLine();
        String reversed = "";
        int i = text.length() - 1;
        while (i >= 0) {
            reversed = reversed + text.charAt(i);
            i--;
        }
        if (text.equals(reversed)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}



//task4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String text = input.nextLine();
        System.out.println("Enter the split character:");
        char splitChar = input.nextLine().charAt(0);
        String currentPart = "";
        int i = 0;
        while (i < text.length()) {
            char c = text.charAt(i);
            if (c == splitChar) {
                System.out.println(currentPart);
                currentPart = "";
            } else {
                currentPart = currentPart + c;
            }
            i++;
        }
        System.out.println(currentPart);
    }
}


//task5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = input.nextLine();
        int length = text.length();
        int end = length - 1;
        String word = "";
        while (end >= 0) {
            char c = text.charAt(end);
            if (c == ' ' || end == 0) {
                if (end != 0) {
                    System.out.print(word + " ");
                    word = "";
                } else {
                    System.out.print(c + word);
                }
            } else {
                word = c + word;
            }
            end--;
        }
        System.out.println();
    }
}


//task6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the phrase:");
        String phrase = input.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
            else if (Character.isAlphabetic(c) && vowels.indexOf(c) == -1) {
                consonantCount++;
            }
        }
        if (vowelCount > 0 && consonantCount > 0 &&
            vowelCount % 3 == 0 && consonantCount % 5 == 0) {
            System.out.println("Aaarr! Me Plunder!!");
        } else {
            System.out.println("Blimey! No Plunder!!");
        }
    }
}


//task7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String unique1 = "";
        String unique2 = "";
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            boolean found = false;
            for (int j = 0; j < str2.length(); j++) {
                if (c == str2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique1 += c;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            boolean found = false;
            for (int j = 0; j < str1.length(); j++) {
                if (c == str1.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique2 += c;
            }
        }
        String result = unique1 + unique2;
        String upper = "";
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upper += (char)(ch - 'a' + 'A');
            } else {
                upper += ch;
            }
        }
        System.out.println(upper);
    }
}


//Task8
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";
        int toggle = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                if (toggle % 2 == 0) {
                    if (c >= 'A' && c <= 'Z') {
                        c = (char)(c + 32);
                    }
                } else {
                    if (c >= 'a' && c <= 'z') {
                        c = (char)(c - 32);
                    }
                }
                toggle++;
            }
            result = result + c;
        }
        System.out.println(result);
    }
}


//task9
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        int length = password.length();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        if (length >= 8) {
            for (int i = 0; i < length; i++) {
                char c = password.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    hasUpper = true;
                } else if (c >= 'a' && c <= 'z') {
                    hasLower = true;
                } else if (c >= '0' && c <= '9') {
                    hasDigit = true;
                } else if (c != ' ') {
                    hasSpecial = true;
                }
            }
        }
        if (length >= 8 && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

//task10
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        int nameLength = name.length();
        int passLength = password.length();
        boolean isValid = true;
        for (int i = 0; i <= passLength - nameLength; i++) {
            boolean match = true;
            for (int j = 0; j < nameLength; j++) {
                if (name.charAt(j) != password.charAt(i + j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

