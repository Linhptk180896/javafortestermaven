package JavaBasic;


import java.util.Scanner;

public class topic01_for_demo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số: ");

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (sum(a, b) % 2 != 0) {
            System.out.println("Đây là số lẻ");

        } else {
            System.out.println("Đây là số chẵn");
        }

        System.out.println("Nhập tuổi: ");
        int year = scan.nextInt();
        yearOld(year);


    }

    public static int sum(int a, int b) {
        int sumNumber = a + b;
        System.out.println(sumNumber);
        return sumNumber;

    }

    public static void yearOld(int year) {
        if (year >= 18) {
            System.out.println("Adult");
        }
    }

}




