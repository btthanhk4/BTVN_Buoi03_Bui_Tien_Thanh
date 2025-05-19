package data.tb;

import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập một số nguyên dương: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        }else {
            for (int i = 0; i < 10; i++) {
                System.out.println(n + " x " + i + " = " + n*i);
            }
        }
    }
}
