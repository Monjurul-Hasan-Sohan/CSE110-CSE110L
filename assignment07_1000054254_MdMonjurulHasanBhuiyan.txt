//Task1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner zxq = new Scanner(System.in);
        System.out.print("N = ");
        int lup = zxq.nextInt();
        int[] ytr = new int[lup];
        int idx = 0;
        while (idx < lup) {
            System.out.print("Enter a number: ");
            ytr[idx] = zxq.nextInt();
            idx++;
        }
        System.out.print("Enter another number: ");
        int jkq = zxq.nextInt();
        int[] vbn = new int[lup + 1];
        for (int klm = 0; klm < lup; klm++) {
            vbn[klm] = ytr[klm];
        }
        vbn[lup] = jkq;
        System.out.println("The elements of the array are:");
        for (int lmn = 0; lmn < lup; lmn++) {
            System.out.println(lmn + ": " + ytr[lmn]);
        }
        System.out.println("After resizing the array:");
        int ptr = 0;
        while (ptr < vbn.length) {
            System.out.print(vbn[ptr] + " ");
            ptr++;
        }
    }
}





//task2
public class Main {
    public static void main(String[] args) {
        int[] kqp = {9, -5, 7, 9, -5, 5, 7};
        System.out.println("Before removing duplicates:");
        int zmv = 0;
        while (zmv < kqp.length) {
            System.out.print(kqp[zmv] + " ");
            zmv++;
        }
        for (int xle = 0; xle < kqp.length; xle++) {
            for (int rtu = xle + 1; rtu < kqp.length; rtu++) {
                if (kqp[xle] == kqp[rtu] && kqp[xle] != 0) {
                    kqp[rtu] = 0;
                }
            }
        }
        System.out.println("\nAfter replacing duplicates with 0:");
        int ijx = 0;
        while (ijx < kqp.length) {
            System.out.print(kqp[ijx] + " ");
            ijx++;
        }
    }
}



//task3
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pzn = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int frs = pzn.nextInt(); 
        int[] mld = new int[frs];
        int ixz = 0;
        while (ixz < frs) {
            System.out.print("Enter a number: ");
            mld[ixz] = pzn.nextInt();
            ixz++;
        }
        int[] xok = new int[frs];
        for (int wqt = 0; wqt < frs; wqt++) {
            xok[wqt] = mld[frs - 1 - wqt];
        }       
        System.out.println("Reversed using a new array:");
        int vnm = 0;
        while (vnm < frs) {
            System.out.print(xok[vnm] + " ");
            vnm++;
        }
        int left = 0;
        int right = frs - 1;
        while (left < right) {
            int tmp = mld[left];
            mld[left] = mld[right];
            mld[right] = tmp;
            left++;
            right--;
        }
        System.out.println("\nReversed the original array:");
        for (int bca = 0; bca < frs; bca++) {
            System.out.print(mld[bca] + " ");
        }
    }
}



//task4
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner rbn = new Scanner(System.in);        
        System.out.print("N = ");
        int plo = rbn.nextInt();        
        int[] cvm = new int[plo];
        int bqx = 0;
        while (bqx < plo) {
            cvm[bqx] = rbn.nextInt();
            bqx++;
        }        
        System.out.println("Original array:");
        for (int xay = 0; xay < plo; xay++) {
            System.out.print(cvm[xay] + " ");
        }        
        int jmw = 0;
        while (jmw < plo) {
            if (cvm[jmw] > 0) {
                cvm[jmw] = 1;
            } else if (cvm[jmw] < 0) {
                cvm[jmw] = 0;
            }
            jmw++;
        }
        System.out.println("\nAfter modifying:");
        for (int luh = 0; luh < plo; luh++) {
            System.out.print(cvm[luh] + " ");
        }
    }
}




//task5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ylf = new Scanner(System.in);
        System.out.print("N = ");
        int xwe = ylf.nextInt();
        int[] dud = new int[xwe];
        int atp = 0;
        while (atp < xwe) {
            System.out.print("Enter a number: ");
            dud[atp] = ylf.nextInt();
            atp++;
        }
        int tov = ylf.nextInt();
        boolean qmk = false;
        for (int oen = 0; oen < xwe; oen++) {
            if (dud[oen] == tov) {
                System.out.println(tov + " is at index " + oen);
                qmk = true;
                break;
            }
        }
        if (!qmk) {
            System.out.println("Element not found");
        }
    }
}



//task6
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner jnx = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int ftr = jnx.nextInt();
        double[] zab = new double[ftr];
        int idx = 0;
        while (idx < ftr) {
            System.out.print("Enter a number: ");
            zab[idx] = jnx.nextDouble();
            idx++;
        }
        double kyy = zab[0];
        int wpa = 0;
        double qlc = zab[0];
        int gse = 0;
        double hdo = 0;
        for (int box = 0; box < ftr; box++) {
            if (zab[box] > kyy) {
                kyy = zab[box];
                wpa = box;
            }
            if (zab[box] < qlc) {
                qlc = zab[box];
                gse = box;
            }
            hdo += zab[box];
        }
        System.out.println("Maximum element " + kyy + " found at index " + wpa);
        System.out.println("Minimum element " + qlc + " found at index " + gse);
        System.out.println("Summation: " + hdo);
        System.out.println("Average: " + (hdo / ftr));
    }
}




//task7	
public class UniqueArray {
    public static void main(String[] args) {
        int[] ikv = {23, 100, 23, 56, 100};
        int vnx = ikv.length;
        int[] bxy = new int[vnx];
        int qjo = 0;
        int hxk = 0;
        while (hxk < vnx) {
            boolean tmf = false;
            for (int buw = 0; buw < qjo; buw++) {
                if (ikv[hxk] == bxy[buw]) {
                    tmf = true;
                    break;
                }
            }
            if (!tmf) {
                bxy[qjo] = ikv[hxk];
                qjo++;
            }
            hxk++;
        }
        System.out.print("Input array:\n");
        for (int rln = 0; rln < vnx; rln++) {
            System.out.print(ikv[rln] + " ");
        }

        System.out.print("\nNew array:\n");
        for (int rln = 0; rln < qjo; rln++) {
            System.out.print(bxy[rln] + " ");
        }
    }
}



//task8
import java.util.Scanner;
public class SubsetCheck {
    public static void main(String[] args) {
        Scanner ztp = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int yha = ztp.nextInt();
        int[] rju = new int[yha];
        System.out.println("Please enter the elements of the arr1:");
        int nwu = 0;
        while (nwu < yha) {
            rju[nwu] = ztp.nextInt();
            nwu++;
        }
        System.out.print("Please enter the length of array 2: ");
        int oxa = ztp.nextInt();
        int[] vum = new int[oxa];

        System.out.println("Please enter the elements of the arr2:");
        for (int kcb = 0; kcb < oxa; kcb++) {
            vum[kcb] = ztp.nextInt();
        }
        boolean fsz = true;
        int uey = 0;
        while (uey < oxa) {
            boolean mqo = false;
            for (int mhx = 0; mhx < yha; mhx++) {
                if (vum[uey] == rju[mhx]) {
                    mqo = true;
                    break;
                }
            }
            if (!mqo) {
                fsz = false;
                break;
            }
            uey++;
        }

        if (fsz) {
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }
    }
}



//task9
import java.util.Scanner;
public class DescendingSelectionSort {
    public static void main(String[] args) {
        Scanner wrg = new Scanner(System.in);
        System.out.print("N = ");
        int xza = wrg.nextInt();
        int[] hql = new int[xza];
        int bko = 0;
        while (bko < xza) {
            System.out.print("Enter a number: ");
            hql[bko] = wrg.nextInt();
            bko++;
        }
        System.out.println("Original Array:");
        int jft = 0;
        while (jft < xza) {
            System.out.print(hql[jft] + " ");
            jft++;
        }
        System.out.println();
        for (int kiz = 0; kiz < xza - 1; kiz++) {
            int sul = kiz;
            for (int vuw = kiz + 1; vuw < xza; vuw++) {
                if (hql[vuw] > hql[sul]) {
                    sul = vuw;
                }
            }
            if (sul != kiz) {
                int tdp = hql[kiz];
                hql[kiz] = hql[sul];
                hql[sul] = tdp;
            }
        }
        System.out.println("Sorted Array:");
        int zpo = 0;
        while (zpo < xza) {
            System.out.print(hql[zpo] + " ");
            zpo++;
        }
    }
}


//task10
import java.util.Scanner;
public class SortMarksAndNames {
    public static void main(String[] args) {
        Scanner rtx = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int szj = rtx.nextInt();
        int[] xts = new int[szj];
        String[] znr = new String[szj];
        for (int dwf = 0; dwf < szj; dwf++) {
            System.out.print("Enter mark for student " + (dwf + 1) + ": ");
            xts[dwf] = rtx.nextInt();
            System.out.print("Enter name for student " + (dwf + 1) + ": ");
            znr[dwf] = rtx.next();
        }
        // Bubble sort
        for (int i = 0; i < szj - 1; i++) {
            for (int j = 0; j < szj - 1 - i; j++) {
                if (xts[j] > xts[j + 1]) {
                    // Swap marks
                    int tempMark = xts[j];
                    xts[j] = xts[j + 1];
                    xts[j + 1] = tempMark;

                    // Swap corresponding names
                    String tempName = znr[j];
                    znr[j] = znr[j + 1];
                    znr[j + 1] = tempName;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int zpn = 0; zpn < szj; zpn++) {
            System.out.print(xts[zpn] + " ");
        }
        System.out.println();
        for (int zpn = 0; zpn < szj; zpn++) {
            System.out.print(znr[zpn] + " ");
        }
    }
}
