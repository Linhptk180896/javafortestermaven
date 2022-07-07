package JavaBasic;

import java.util.Scanner;

public class Hw06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        // biến thứ 3
        int c = a+b;
        //  value of  a = value of b
        System.out.println("Đổi giá trị của a là " + (c-a) + " và giá tri của b là " + (c-b) );

    }
}
