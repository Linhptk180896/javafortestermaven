package JavaBasic;

import java.util.Scanner;

public class Hw01Operator {
    public static void main(String[] args) {
        hw01Operator();

    }

    public  static  void  hw01Operator(){
        Scanner scan = new Scanner(System.in);
        int  a = scan.nextInt();
        int b = scan.nextInt();

        // In ra số lớn nhất
        if (a > b){
            System.out.println(a + " lớn hơn " + b);
        }

        // Tính tổng
        System.out.println("Tổng là: " + (a + b));
        //Tính hiệu
        System.out.println("Hiệu là: " + (a - b));
        //Tính thương
        System.out.println("Thương là: " + (a / b));
        //Tính lấy dư
        System.out.println("Dư là: " + (a % b));

    }
}
