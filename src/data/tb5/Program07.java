package data.tb5;

import java.util.Scanner;

public class Program07 {
    public static void main(String[] args) {
        Cal cal = new Cal();
        int result1 = cal.getTotal();

        System.out.println("result1: " + result1);

        int result2 = cal.getMultiple();
        System.out.println("result2: " + result2);

        Program07 program = new Program07();
        int result3 = program.getSub();
        System.out.println("result3: " + result3);

    }

    public int getSub() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int result = num1 - num2;
        return result;
    }
}
