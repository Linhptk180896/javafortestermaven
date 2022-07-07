package JavaBasic;

import java.util.Scanner;

public class Hw07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Đổi giá trị của a là " + a + " và giá tri của b là " + b );

    }
}
