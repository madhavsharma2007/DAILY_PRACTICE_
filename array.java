//ARRAY PASSING IN JAVA:

//DECELARTION (STEP 1):
// int arr[];

//ALLOCATION (STEP2):
//arr = new int[10]; here 10 in size of array space;

//INITIALLISATION (STEP3):
//int marks[] = {100, 98, 78,67, 56, 45, 23,12,23,45}

//QUESTION 1(indexing practice)
// import java.io.*;
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int arr[];
//         arr = new int[5];
//         int marks[] = { 100, 67, 78, 56, 45 };
//         int n = marks.length;
//         for (int index = 0; index <= n - 1; index++) {
//             System.out.println(marks[index]);
//         }
//         s.close();
//     }
// }

//QUESTION 2(taking input array)
// import java.io.*;
// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size;
//         System.out.println("enter your size here: ");
//         size = sc.nextInt();
//         int arr[] = new int[size];
//         for (int count = 1; count <= size; count++) {
//             int index = count - 1;
//             System.out.println("Enter the values for index: " + index);
//             arr[index] = sc.nextInt();
//         }
//         for (int n : arr) {
//             System.out.println(n);
//         }
//     }
// }

//QUESTION 3(SUM OF ALL VALUES IN ARRAY)
// import java.io.*;
// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your marks size here: ");
//         int size = sc.nextInt();
//         int marks[] = new int[size];
//         for (int count = 0; count < size; count++) {
//             System.out.print("Enter the value for index: " + count + " -> ");
//             marks[count] = sc.nextInt();
//         }
//         int sum = 0;
//         for (int mark : marks) {
//             sum = sum + mark;
//         }
//         System.out.println("Total sum: " + sum);
//     }
// }

//QUESTION 4(PRODUCT OF ALL VALUES IN ARRAY)
// import java.io.*;
// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your size here: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for (int count = 0; count < size; count++) {
//             System.out.print("Enter the value for index: " + count + " ->");
//             arr[count] = sc.nextInt();
//         }
//         int product = 1;
//         for (int number : arr) {
//             product = product * number;
//         }
//         System.out.println("Final Product: " + product);

//     }
// }

//QUESTION 5(FIND MINIMUM VALUE IN THE ARRAY)
// import java.io.*;
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         int arr[] = { 100, 50, 20, 150, -5, 250, -50, 12, 16 };
//         int mini = Integer.MAX_VALUE;
//         for (int num : arr) {
//             if (num < mini) {
//                 mini = num;
//             }
//         }
//         System.out.println("Mini number is: " + mini);
//     }
// }

//QUESTION 6(FIND MAXIMUM VALUE IN THE ARRAY)
// import java.io.*;
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         int arr[] = { 100, 50, 20, 45, 90, 300 };
//         int maxi = Integer.MIN_VALUE;
//         for (int num : arr) {
//             if (num > maxi) {
//                 maxi = num;
//             }
//         }
//         System.out.println("Maximum number is: " + maxi);
//     }
// }

//QUESTION 7(STARTING 2D ARRAY)
// import java.io.*;
// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
//         int arr[][] = {
//                 { 2, 3, 4 },
//                 { 6, 8, 5 },
//                 { 1, 9, 6 }
//         };
//         int rowsize = arr.length;
//         int colmsize = arr[0].length;
//         for (int rowIndex = 0; rowIndex < rowsize; rowIndex++) {
//             for (int colmIndex = 0; colmIndex < colmsize; colmIndex++) {
//                 System.out.print(arr[rowIndex][colmIndex] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//QUESTION 8(ADDING ALL VALUE IN 2D ARRAY)
// import java.io.*;
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         int arr[][] = {
//                 { 2, 3, 4 },
//                 { 5, 6, 7 },
//                 { 9, 8, 7 }
//         };

//         int rowsize = arr.length;
//         int colmsize = arr[0].length;

//         int sum = 0;
//         for (int rowIndex = 0; rowIndex < rowsize; rowIndex++) {
//             for (int colmIndex = 0; colmIndex < colmsize; colmIndex++) {
//                 sum = sum + arr[rowIndex][colmIndex];
//             }
//         }
//         System.out.println("overall sum: " + sum);
//     }
// }

//QUESTION 9(PRINTING ALL THE VOWELS WITH THE SPACING)
// import java.io.*;
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String text = sc.nextLine();
//         for (int i = 0; i < text.length(); i++) {
//             char c = text.charAt(i);
//             if ("aeiouAEIOU".indexOf(c) != -1) {
//                 System.out.print(c + " ");
//             }
//         }
//     }
// }

//QUESTION 10(COUNT THE GIVEN  NUMBER IN THE STRING)
// import java.util.Scanner;
// import java.io.*;
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         char ch = sc.next().charAt(0);
//         int count = 0;
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == ch) {
//                 count++;
//             }
//         }
//         System.out.println("count : " + count);
//         sc.close();
//     }
// }

//QUESTION 11(COUNTING VOWELCOUNT AND CONSONANTCOUNT)
// import java.io.*;
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int vowelCount = 0;
//         int consonantCount = 0;
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (Character.isLetter(c)) {
//                 if ("aeiouAEIOU".indexOf(c) != -1) {
//                     vowelCount++;
//                 } else {
//                     consonantCount++;
//                 }
//             }
//         }
//         System.out.println(vowelCount + " " + consonantCount);
//         sc.close();
//     }
// }

//QUESTION 12(REVERSING THE STRING AND NUMBERS)
import java.io.*;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

}