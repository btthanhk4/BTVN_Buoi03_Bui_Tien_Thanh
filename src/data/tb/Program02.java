package data.tb;

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;

        System.out.println("Hãy nhập các số nguyên: ");
        boolean flag = true;
        while (flag) {
            System.out.println("Nhập số: ");
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
        }
        System.out.println("Tổng của các số đã nhập là: " + sum);
    }
}
