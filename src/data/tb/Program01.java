package data.tb;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào một số nguyên tố: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(n + " không phải số nguyên tố");
        } else {
            boolean soNguyenTo = true;
            for (int i = 2; i < n; ++i) {
                if (n % i == 0) {
                    soNguyenTo = false;
                    break;
                }
            }
            if (soNguyenTo) {
                System.out.println(n+" là số nguyên tố");
            }else {
                System.out.println(n + " không phải là số nguyên tố");
            }
        }
    }
}
