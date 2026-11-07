import java.io.*;
import java.util.Scanner;
public class belt {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int num = sc.nextInt();

if (num < 10){
System.out.println("Invalid Number");
}else {
System.out.println((num/10)%10);
}
}
}