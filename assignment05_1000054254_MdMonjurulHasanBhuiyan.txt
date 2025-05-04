//Task1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int songkha = sc.nextInt();

        for (int i = 1; i <= songkha; i = i + 1) {
            System.out.print(i);
        }
    }
}




//task2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 1; i <= row; i = i + 1) {
            for (int j = 1; j <= col; j = j + 1) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}





//task3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int row = scaner.nextInt();

        for (int line = 1; line <= row; line = line + 1) {
            for (int num = 1; num <= line; num = num + 1) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}




//task4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();

        for (int line = 1; line <= row; line = line + 1) {
            int space = row - line;
            int shuru = row - line + 1;

            for (int s = 1; s <= space; s = s + 1) {
                System.out.print(" ");
            }

            for (int num = shuru; num <= row; num = num + 1) {
                System.out.print(num);
            }

            System.out.println();
        }
    }
}




//task5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();

        for (int line = 1; line <= row; line = line + 1) {
            int space = row - line;
            int totalNum = (2 * line) - 1;

            for (int s = 1; s <= space; s = s + 1) {
                System.out.print(" ");
            }

            for (int num = 1; num <= totalNum; num = num + 1) {
                System.out.print(num);
            }

            System.out.println();
        }
    }
}






//task6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();

        // upper triangle
        for (int line = 1; line <= row; line = line + 1) {
            int space = row - line;
            int totalNum = (2 * line) - 1;

            for (int s = 1; s <= space; s = s + 1) {
                System.out.print(" ");
            }

            for (int num = 1; num <= totalNum; num = num + 1) {
                System.out.print(num);
            }

            System.out.println();
        }

        // lower triangle
        for (int line = row - 1; line >= 1; line = line - 1) {
            int space = row - line;
            int totalNum = (2 * line) - 1;

            for (int s = 1; s <= space; s = s + 1) {
                System.out.print(" ");
            }

            for (int num = 1; num <= totalNum; num = num + 1) {
                System.out.print(num);
            }

            System.out.println();
        }
    }
}





//task7
import java.util.Scanner;

public class Maiin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        for (int line = 1; line <= row; line = line + 1) {
            if (line == 1 || line == row) {
                for (int num = 1; num <= col; num = num + 1) {
                    System.out.print(num);
                }
            } else {
                System.out.print("1");
                for (int space = 1; space <= col - 2; space = space + 1) {
                    System.out.print(" ");
                }
                System.out.print(col);
            }
            System.out.println();
        }
    }
}


//task8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();

        for (int line = 1; line <= row; line = line + 1) {
            if (line == 1) {
                System.out.print("1");
            } else if (line == row) {
                for (int num = 1; num <= (2 * line - 1); num = num + 1) {
                    System.out.print(num);
                }
            } else {
                System.out.print("1");
                for (int space = 1; space <= (2 * line - 3); space = space + 1) {
                    System.out.print(" ");
                }
                System.out.print(2 * line - 1);
            }
            System.out.println();
        }
    }
}



//task9
public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n) {
            int space = 1;
            while (space <= 2 * (n - row)) {
                System.out.print(" ");
                space++;
            }
            int num = 1;
            while (num <= row) {
                if (row == n || num == row || num == 1) {
                    System.out.print(n - row + num + " ");
                } else {
                    System.out.print("  ");
                }
                num++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}


//task10
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sp = n - i;

            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            System.out.print("1");

            if (i != 1 && i != n) {
                for (int space = 1; space <= (2 * i - 3); space++) {
                    System.out.print(" ");
                }
                System.out.print(2 * i - 1);
            }

            if (i == n) {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print(j);
                }
            }

            System.out.println();
        }
    }
}


//Task11
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print(2 * i - 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print(2 * i - 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




//task12
import java.util.Scanner;

public class Mian{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }

        for (int i = n - 1; i >= 1; i--) {
            System.out.print(i);
        }

        System.out.println();
    }
}


//task13
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}



//task14
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }


            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}



//task15
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i -= 2) {
            for (int s = 1; s <= (n - i) / 2; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 3; i <= n; i += 2) {
            for (int s = 1; s <= (n - i) / 2; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

