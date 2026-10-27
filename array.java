//QUESTION1
// import java.io.*;
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         int marks[] = { 100, 99, 98, 97, 96 };
//         System.out.println("First Element: " + marks[0]);
//         System.out.println("Second Element: " + marks[1]);
//         System.out.println("Third Element: " + marks[2]);
//     }
// }

//QUESTION2
// import java.io.*;
// import java.util.Scanner;
// public class array {
// public static void main(String[] args) {
// int marks[] = { 100, 45, 35, 67, 89, 65, 70};
// System.out.println(marks.length);
// }
// }

//QUESTION3(for loop);
// import java.io.*;
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         int marks[] = { 1, 2, 3, 4, 5, 6, 7 };
//         int n = marks.length;
//         for (int index = 0; index <= n - 1; index++) {
//             System.out.println(marks[index]);
//         }
//     }
// }

//QUESTION4(For Each Loop Array);
// import java.io.*;
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         int marks[] = { 10, 20, 30, 40, 50 };
//         for (int number : marks) {
//             System.out.println(number);
//         }
//     }
// }

//QUESTION5
// import java.io.*;
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of your array : ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for (int count = 1; count <= size; count++) {
//             int index = count - 1;
//             System.out.println("enter value for the index: " + index);
//             arr[index] = sc.nextInt();
//         }
//         for (int n : arr) {
//             System.out.println(n + " ");
//         }
//     }
// }

//QUESTION6(Sum Of All Elements);
// import java.io.*;
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your Size here:  ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for (int count = 1; count <= size; count++) {
//             int index = count - 1;
//             System.out.println("Enter the value of index here: " + index);
//             arr[index] = sc.nextInt();
//         }
//         int sum = 0;
//         for (int n : arr) {
//             sum += n;
//         }
//         System.out.println("Total sum: " + sum);
//     }
// }

//QUESTION7
import java.io.*;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size here: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int count = 1; count <= size; count++) {
            int index = count - 1;
            System.out.println("Enter the value of index here: " + index);
            arr[index] = sc.nextInt();
        }
        int multiplication = 1;
        for (int n : arr) {
            multiplication *= n;

        }
        System.out.println("Total multipication: " + multiplication);

    }
}