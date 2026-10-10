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

// public class TemperatureConverter {

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

// //QUESTION13
// import java.io.*;
// import java.util.Scanner;
// public class belt {
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

// System.out.println((int)(num *10)%10);
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
// public class belt{
// public static void main(String[] args){
// for ( int i = 1 ; i <= 100 ; i += 2){
// System.out.print(i + " ");
// }
// }
// }
