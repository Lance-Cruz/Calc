package ie.atu.week3;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        //methods
        System.out.println("Please enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter an operation: ");
        String op = sc.next();
        switch (op) {
            case "add": add(num1, num2); break;
            default: System.out.println("Invalid operation"); break;
        }
    }
    public static void add(int a, int b)
    {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
