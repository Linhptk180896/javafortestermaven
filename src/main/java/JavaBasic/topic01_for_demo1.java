package JavaBasic;

import java.util.Scanner;

public class topic01_for_demo1 {
    //  const name = 5;



    public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    System.out.println("Nhập từ bạn muốn tìm vào đây");
//    int n = scan.nextInt();
//    if (checkNTo(n)){
//      System.out.println(n + " là số nguyên tố");
//    } else {
//      System.out.println("Ngược lại");
//


        Scanner scan = new Scanner(System.in);
        System.out.println("Mời bản nhập từ");
        String type = scan.nextLine();


        switch (type) {
            case "bò":
                System.out.println("this is con bò");
                break;
            case "ngựa":


                System.out.println("This is con ngựa");
                break;
            case "lợn":
                System.out.println("this is con lợn");
                break;
            default:
                System.out.println("Nothing");
                int time = 20;
                String result = (time < 18) ? "Good day." : "Good evening.";
                System.out.println(result);
        }


    }
}
