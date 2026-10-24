
// //  QUESTION 29
// import java.util.Scanner;

// public class one {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rating = sc.nextInt();

//         switch (rating) {
//             case 1:
//                 System.out.println("Poor");
//                 break;
//             case 3:
//                 System.out.println("good");
//                 break;
//             case 5:
//                 System.out.println("Excellent");
//         }
//     }
// }

// //  QUESTION30
// import java.util.Scanner;
// import java.io.*;

// public class one {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int keys = sc.nextInt();
//         switch (keys) {
//             case 1:
//                 System.out.println("one");
//                 break;
//             case 2:
//                 System.out.println("two");
//                 break;
//             case 3:
//                 System.out.println("three");
//                 break;
//             case 4:
//                 System.out.println("four");
//                 break;
//             default:
//                 System.out.println("Default");
//         }
//     }
// }

// //     QUESTION 31
// import java.io.*;
// import java.util.Scanner;
// public class one {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int Mb = sc.nextInt();
//         if (Mb <= 1500) {
//             System.out.println("Normal Usage");
//         } else if (Mb >= 1500 && Mb <= 2000) {
//             System.out.println("Warning: 75% Data Exhausted");
//         } else {
//             System.out.println("Data Exhausted. Extra Charge: " + (Mb - 2000) * 0.50);
//         }
//     sc.close();
//     }
// }

// // QUESTION32
// import java.io.*;
// import java.util.Scanner;
// public class one {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         a = a + b;
//         b = a - b;
//         a = a - b;
//         System.out.println("after swaping: a= " + a + ", b= " + b);
//     }
// }

// //QUESTION33
// import java.io.*;
// import java.util.Scanner;

// public class one {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int days = sc.nextInt();

//         switch (days) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thurday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("invalid input");
//         }
//     }
// }

// // QUESTION34
// import java.io.*;
// import java.util.Scanner;

// public class one {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int bill;
//         double total_bill = 0;
//         int units = sc.nextInt();
//         if (units <= 100) {
//             bill = units * 5;
//         } else if (units <= 200) {
//             bill = 100 * 5 + (units - 100) * 7;
//         } else {
//             bill = 100 * 5 + 100 * 7 + ((units - 200) * 10);
//         }

//         if (bill > 1500) {
//             total_bill = (bill + bill * 0.05);
//         } else {
//             total_bill = bill;
//         }

//         System.out.printf("%.2f\n", total_bill);

//     }
// }

// //  QUESTION35
// import java.io.*;
// import java.util.Scanner;

// public class one {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if ((a + b > c) && (b + c > a) && (c + a > b)) {
//             if (a == b && b == c) {
//                 System.out.println("Equilateral");
//             } else if (a == b || b == c || c == a) {
//                 System.out.println("Isosceles");
//             } else {
//                 System.out.println("Scalene");
//             }
//         } else {
//             System.out.println("Invalid Triangle");
//         }
//         sc.close();
//     }
// }

// //QUESTION 36
// import java.io.*;
// import java.util.Scanner;

// public class one {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();

//         if (year % 4 == 0 || year % 100 != 0 && year % 4 == 0) {
//             System.out.println("Eligible");
//         } else {
//             System.out.println("Not Eligible");
//         }
//     }
// }

// 

// //  QUESTION 37
// import java.io.*;
// import java.util.Scanner;
// public class one {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int month = sc.nextInt();
//         switch (month) {
//             case 12, 1, 2:
//                 System.out.println("Winter");
//                 break;
//             case 3, 4, 5:
//                 System.out.println("Spring");
//                 break;
//             case 6, 7, 8:
//                 System.out.println("Summer");
//                 break;
//             case 9, 10, 11:
//                 System.out.println("Autumn");
//                 break;
//             default:
//                 System.out.println("Invalid Number");
//         }
//     }
// }



