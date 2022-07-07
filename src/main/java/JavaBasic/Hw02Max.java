package JavaBasic;

import java.util.Scanner;

public class Hw02Max {
    public static void main(String[] args) {
        run();

    }

    public static void run(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // In ra số lớn nhất
        if (a>=b && a>c){
            System.out.println("Số lớn nhất: " + a);
        } else if (b>=a && b>c){
            System.out.println("Số lớn nhất: " + b);
        }
        else if (c>=a && c>b){
            System.out.println("Số lớn nhất: " + c);
        }
        else {
            System.out.println("3 số bằng nhau");
        }
    }

}

