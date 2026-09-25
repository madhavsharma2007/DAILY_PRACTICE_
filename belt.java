// //QUESTION1
// import java.util.Scanner;

// public class belt {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your character here: ");
//         String alpha = sc.next();
//         System.out.print("Your Entered Character: " + alpha);
//     }
// }

// //QUESTION2
// import java.util.Scanner;

// public class belt {
//     public static void convertToSeconds(int hours) {
//         int seconds = hours * 3600;
//         System.out.println(seconds);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int hours = sc.nextInt();
//         convertToSeconds(hours);
//         sc.close();
//     }
// }

// //QUESTION3
// import java.util.Scanner;

// public class belt {
//     public static void convertToHours(int seconds) {
//         double hours = seconds / 3600.0;
//         System.out.printf("%.3f\n", hours);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int seconds = sc.nextInt();

//         convertToHours(seconds);
//         sc.close();

//     }
// }

// //QUESTION4
// import java.util.Scanner;

// public class TemperatureConverter {

//     public static void convertTemperature(float temp, String unit) {
//         float result;

//         // Use equalsIgnoreCase to compare string content safely
//         if (unit.equalsIgnoreCase("c")) {
//             result = (temp * 9.0f / 5.0f) + 32;
//         } else {
//             result = (temp - 32) * 5.0f / 9.0f;
//         }

//         // Added missing double quotes around the format string
//         System.out.printf("%.2f\n", result);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float temp = sc.nextFloat();
//         String unit = sc.next();

//         convertTemperature(temp, unit);
//         sc.close();
//     }
// }

// //QUESTION5
// import java.util.Scanner;

// public class belt {
//     public static void calculateSimpleIntrest(float P, float R, float T) {
//         float si = (P * R * T) / 100;
//         System.out.printf("%.2f\n", si);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float P = sc.nextFloat();
//         float R = sc.nextFloat();
//         float T = sc.nextFloat();
//         calculateSimpleIntrest(P, R, T);
//         sc.close();
//     }
// }

//QUESTION6
import java.util.Scanner;

public class belt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float result = (a + b + c) / 3;
        System.out.printf("%.2f\n", result);
    }
}