package JavaBasic;

import java.util.Scanner;

public class Hw08QuadraticEquation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextInt();
        float b = scan.nextInt();
        float c = scan.nextInt();
        double x1;
        double x2;
        float delta = ((b*b) - (4*a*c));
        double sqrtDelta = Math.sqrt(delta);

        // a = 0 -> Phương trình thành bx +c = 0
        if (a==0) {
            x1 = (-c/b);
            System.out.println("Phương trình có 1 nghiệm " + x1);

        }

        // a !=0 -> Phương trình có nghiệm
        else{

            if (delta < 0){
                System.out.println("Phương trình vô nghiệm");

            }
            else if (delta==0){
                x1 = (-b/2*a);
                x2 = x1;
                System.out.println("Phương trình có 1 nghiệm x1 = " + x1 +"; x2= " + x2 );

            }
            else if (delta>0){
                x1 = ((-b + sqrtDelta)/(2*a));
                x2 = ((-b - sqrtDelta)/(2*a));
                System.out.println("Phuong trình có 2 nghiệm x1 = " + x1 + "; x2= " +x2);
            }


        }

    }
}
