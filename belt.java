// //QUESTION1
// import java.util.Scanner;
// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter your character here: ");
// String alpha = sc.next();
// System.out.print("Your Entered Character: " + alpha);
// }
// }

// //QUESTION2
// import java.util.Scanner;
// public class belt {
// public static void convertToSeconds(int hours) {
// int seconds = hours * 3600;
// System.out.println(seconds);
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int hours = sc.nextInt();
// convertToSeconds(hours);
// sc.close();
// }
// }

// //QUESTION3
// import java.util.Scanner;

// public class belt {
// public static void convertToHours(int seconds) {
// double hours = seconds / 3600.0;
// System.out.printf("%.3f\n", hours);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int seconds = sc.nextInt();

// convertToHours(seconds);
// sc.close();

// }
// }

// //QUESTION4
// import java.util.Scanner;

// public class belt {

// public static void convertTemperature(float temp, String unit) {
// float result;

// // Use equalsIgnoreCase to compare string content safely
// if (unit.equalsIgnoreCase("c")) {
// result = (temp * 9.0f / 5.0f) + 32;
// } else {
// result = (temp - 32) * 5.0f / 9.0f;
// }

// // Added missing double quotes around the format string
// System.out.printf("%.2f\n", result);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// float temp = sc.nextFloat();
// String unit = sc.next();

// convertTemperature(temp, unit);
// sc.close();
// }
// }

// //QUESTION5
// import java.util.Scanner;

// public class belt {
// public static void calculateSimpleIntrest(float P, float R, float T) {
// float si = (P * R * T) / 100;
// System.out.printf("%.2f\n", si);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// float P = sc.nextFloat();
// float R = sc.nextFloat();
// float T = sc.nextFloat();
// calculateSimpleIntrest(P, R, T);
// sc.close();
// }
// }

// //QUESTION6
// import java.util.Scanner;

// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();

// float result = (a + b + c) / 3;
// System.out.printf("%.2f\n", result);
// }
// }

// //QUESTION7
// import java.util.Scanner;
// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner (System.in);
// int marks_obtained = sc.nextInt();
// int total_marks = sc.nextInt();
// double percentage = ( (double)marks_obtained/total_marks)*100;
// System.out.printf("%.2f\n", percentage);
// }
// }

// //QUESTION8
// import java.util.Scanner;
// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner (System.in);
// int base = sc.nextInt();
// int height = sc.nextInt();
// double area = (0.5 * height *base);;
// System.out.printf("%.2f\n", area);
// sc.close();
// }
// }

// //QUESTION9
// import java.io.*;
// import java.util.Scanner;
// public class belt{
// public static void main(String[] args) {
// Scanner sc = new Scanner (System.in);
// String name = sc.next();
// System.out.println(name.charAt(3));
// }
// }

// //Question10
// import java.io.*;
// import java.util.Scanner;
// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner (System.in);
// int num = sc.nextInt();
// System.out.println( num % 10);
// sc.close();
// }
// }

// //QUESTION11
// import java.io.*;
// import java.util.Scanner;

// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String num = sc.next();
// System.out.println(num.charAt(num.length() - 1));
// }
// }

// // QUESTION12
// import java.io.*;
// import java.util.Scanner;
// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner (System.in);
// int num = sc.nextInt();

// if (num < 10){
// System.out.println("Invalid Number");
// }else {
// System.out.println((num/10)%10);
// }
// }
// }

// // //QUESTION13
// import java.io.*;
// import java.util.Scanner;

// public class belt {System.in
// public static void main(String[] args) {
// Scanner sc = new Scanner (System.in);
// int num1 = sc.nextInt();
// int num2 = sc.nextInt();

// if (num1 < 10 || num2 < 10) {
// System.out.println("Invalid Number");
// }else{
// int digit1 = (num1 / 10) % 10;
// int digit2 = (num2 / 10) % 10;
// System.out.println(digit1 + digit2);
// }
// }
// }

// //QUESTION14
// import java.io.*;
// import java.util.Scanner;

// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// double num = sc.nextDouble();

// System.out.println((int) (num * 10) % 10);
// sc.close();
// }
// }

// //QUESTION15
// import java.io.*;
// import java.util.Scanner;

// public class belt {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for (int i = 1 ; i <= n ; i++){
// System.out.print(i + " ");
// }
// }
// }

// //QUESTION16
// import java.io.*;
// import java.util.Scanner;
// public class belt {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for ( int i = n ; i >= 1; i--){
// System.out.print(i + " ");
// }
// }
// }

// //QUESTION18
// import java.io.*;
// import java.util.Scanner;
// public class belt {
// public static void main(String[] args){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();
// for( int i = 0 ; i <= n*2 ; i += 2){
// System.out.print(i + " ");
// }
// }
// }

// //QUESTION19
// import java.io.*;
// import java.util.Scanner;
// public class belt {
// public static void main(String[] args){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();
// for(int i = 1; i <= n*2 ; i += 2){
// System.out.print(i + " ");
// }
// }
// }

// //QUESTION20
// import java.io.*;
// import java.util.Scanner;
// public class belt {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for( int i = 1 ; i <= 10 ; i++){
// System.out.println(n*i);
// }
// }
// }

// //QUESTION21
// import java.io.*;
// import java.util.Scanner;
// public class belt {
// public static void main(String[] args){
// for ( int i = 0 ; i <= 100 ; i++){
// System.out.print(i + " ");
// }
// }
// }

// //QUESTION22
// import java.io.*;
// import java.util.Scanner;

// public class belt {
// public static void main(String[] args) {
// for (int i = 1; i <= 100; i += 2) {
// System.out.print(i + " ");
// }
// }
// }

// //QUESTION 23
// import java.io.*;
// import java.util.Scanner;

// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// double totalBill = sc.nextDouble();
// double finalBill = 0.00;
// String isPremium = sc.next();

// if (isPremium.equals("true")) {
// if (totalBill > 2000) {
// finalBill = totalBill - (totalBill * 0.2);
// } else {
// finalBill = totalBill - (totalBill * 0.1);
// }
// } else if (isPremium.equals("false")) {
// if (totalBill > 2000) {
// finalBill = totalBill - (totalBill * 0.05);
// } else {
// finalBill = totalBill;
// }
// }

// System.out.printf("%.1f\n", finalBill);
// sc.close();
// }
// }

// QUESTION24
// import java.util.Scanner;

// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// double kwh = sc.nextDouble();
// boolean isPeak = sc.nextBoolean();

// double totalCost = kwh * 15.0;

// if (isPeak) {
// totalCost += totalCost * 0.25; // adds 25% to base cost
// }
// if (kwh > 50.0) {
// totalCost -= 50.0;
// }
// System.out.println(totalCost);

// sc.close();
// }
// }

// //QUESTION25
// import java.io.*;
// import java.util.Scanner;
// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int avaliableStock = sc.nextInt();
// int requestedToken = sc.nextInt();

// if (requestedToken <= 0) {
// System.out.println("Invalid Token Quantity");
// } else if (requestedToken > avaliableStock) {
// System.out.println("Insufficient Stock");
// } else {
// System.out.println("Order Placed. Remaining Stock: " + (avaliableStock -
// requestedToken));
// }

// sc.close();
// }
// }

// //QUESTION26
// import java.io.*;
// import java.util.Scanner;

// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// double accountBalance = sc.nextDouble();
// int withdrawalAmount = sc.nextInt();

// if (withdrawalAmount > accountBalance) {
// System.out.println("Insufficient Balance");
// }
// if (withdrawalAmount % 100 != 0) {
// System.out.println("Invalid Amount: Must be multiple of 100");
// } else {
// System.out.println("Withdrawal Successful. Remaining Balance: " +
// (accountBalance - withdrawalAmount-15));
// }
// }
// }

// //QUESTION27
// import java.util.Scanner;

// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String mode = sc.next();
// boolean hasFASTag = sc.nextBoolean();
// double tollAmount = 0.0;
// boolean isValid = true;

// if (mode.equalsIgnoreCase("Car")) {
// double baseFare = 100;
// if (hasFASTag) {
// tollAmount = baseFare - (baseFare * 0.1);
// } else {
// tollAmount = baseFare + 50;
// }
// } else if (mode.equalsIgnoreCase("Truck")) {
// double baseFare = 250;
// if (hasFASTag) {
// tollAmount = baseFare - (baseFare * 0.1);
// } else {
// tollAmount = baseFare + 50;
// }
// } else if (mode.equalsIgnoreCase("Bus")) {
// double baseFare = 200;
// if (hasFASTag) {
// tollAmount = baseFare - (baseFare * 0.1);
// } else {
// tollAmount = baseFare + 50;
// }
// } else {
// isValid = false;
// System.out.println("Invalid Vehicle Type");
// }
// if (isValid) {
// System.out.println("Toll Amount: " + tollAmount);
// }
// sc.close();
// }
// }

// QUESTION28
// import java.util.Scanner;
// public class belt {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int totalBill;
// int units = sc.nextInt();
// if (units <= 100) {
// totalBill = units * 2;
// } else if (units <= 300) {
// totalBill = (100 * 2) + (units - 100) * 4;
// } else {
// totalBill = (100 * 2) + (200 * 4) + ((units - 300) * 7);
// }
// System.out.println(totalBill);
// }
// }

// //Ouestion29;
// import java.io.*;
// import java.util.Scanner;
// public class belt {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double amount;
//         double gross_amount;
//         int final_amount;
//         double price = sc.nextDouble();
//         int qty = sc.nextInt();
//         amount = price * qty;
//         gross_amount = amount + amount * 0.18;
//         final_amount = (int) gross_amount;
//         System.out.println(final_amount);
//     }
// }

// //QUESTION30
// import java.io.*;
// import java.util.Scanner;

// public class belt {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float attendance = sc.nextFloat();
//         Boolean med_cer = sc.nextBoolean();

//         if (attendance >= 75 || attendance >= 65 && med_cer.equals(true)) {
//             System.out.println("Eligible");
//         } else {
//             System.out.println("Not Eligible");
//         }
//     }
// }

// //QUESTION31
// import java.io.*;
// import java.util.Scanner;

// public class belt {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float bill;
//         float finalbill;
//         int purchase = sc.nextInt();
//         Boolean premier = sc.nextBoolean();

//         if (purchase < 1000) {
//             bill = purchase;
//         } else if (purchase >= 1000 && purchase <= 5000) {
//             bill = (int) (purchase - purchase * 0.10);
//         } else {
//             bill = (int) (purchase - purchase * 0.20);
//         }

//         if (premier.equals(true)) {
//             finalbill = (int) (bill - bill * 0.05);
//         } else {
//             finalbill = (int) (bill);
//         }

//         System.out.println(bill);
//         System.out.println(finalbill);
//     }
// }

// //QUESTION32
// import java.io.*;
// import java.util.Scanner;

// public class belt {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String color = sc.next();
//         boolean isEmergencyVehicle = sc.nextBoolean();

//         switch (color.toUpperCase()) {
//             case "RED":
//                 if (isEmergencyVehicle) {
//                     System.out.println("Proceed with Caution");
//                 } else {
//                     System.out.println("Stop");
//                 }
//                 break;

//             case "YELLOW":
//                 System.out.println("Prepare to Stop");
//                 break;

//             case "GREEN":
//                 System.out.println("Go");
//                 break;

//             default:
//                 System.out.println("Invalid Signal Color");
//                 break;
//         }
//     }
// }

// //QUESTION33
// import java.io.*;
// import java.util.Scanner;

// public class belt {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int marks = sc.nextInt();
//         if (marks >= 90 && marks <= 100) {
//             System.out.println("A");
//         } else if (marks >= 80 && marks <= 89) {
//             System.out.println("B");
//         } else if (marks >= 70 && marks <= 79) {
//             System.out.println("C");
//         } else if (marks >= 60 && marks <= 69) {
//             System.out.println("D");
//         } else if (marks < 60) {
//             System.out.println("F");
//         } else if (marks < 0 || marks > 100) {
//             System.out.println("Invalid Score");
//         }
//     }
// }

// //QUESTION34
// import java.io.*;
// import java.util.Scanner;

// public class belt {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float number1 = sc.nextFloat();
//         float number2 = sc.nextFloat();
//         String opera = sc.next();

//         switch (opera) {
//             case "+":
//                 System.out.println(number1 + number2);
//                 break;
//             case "-":
//                 System.out.println(number1 - number2);
//                 break;
//             case "*":
//                 System.out.println(number1 * number2);
//                 break;
//             case "/":
//                 if (number2 == 0) {
//                     System.out.println("Cannot divide by zero");
//                 } else {
//                     System.out.println((double) number1 / number2);
//                 }
//                 break; // <-- Added this break to prevent fall-through!
//             default:
//                 System.out.println("Invalid Operator");
//         }
//     }
// }

// //QUESTION35
// import java.io.*;
// import java.util.Scanner;

// public class belt {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int bill = 0;
//         int age = sc.nextInt();
//         Boolean isweekend = sc.nextBoolean();

//         if (age < 12) {
//             if (isweekend) {
//                 bill = 7;
//             } else {
//                 bill = 5;
//             }
//         } else if (age >= 12 && age <= 59) {
//             if (isweekend) {
//                 bill = 15;
//             } else {
//                 bill = 10;
//             }
//         } else if (age >= 60) {
//             if (isweekend) {
//                 bill = 8;
//             } else {
//                 bill = 6;
//             }
//         }
//         System.out.println(bill);
//     }
// }

//QUESTION36
import java.io.*;
import java.util.Scanner;

public class belt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int percentage = sc.nextInt();
        float attendance = sc.nextFloat();
        Boolean hasFailedSubeject = sc.nextBoolean();

        if (attendance >= 85 && percentage >= 80) {
            if (hasFailedSubeject) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }
        }
    }
}
