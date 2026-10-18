
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

//  QUESTION30
import java.util.Scanner;
import java.io.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int keys = sc.nextInt();
        switch (keys) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("Default");
        }
    }
}