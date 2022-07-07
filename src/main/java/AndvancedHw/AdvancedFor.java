package AndvancedHw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdvancedFor {
    public static void main(String[] args) {
//        hw2(); //trả lãi sau 5 năm
//        hw1(); //số cách trả tiền
        hw3();
    }

    private  static void hw1() {
        int a = 1; // 500k amount
        int b = 0; //200k amount
        int c = 0; // 100k amount
        int d = 0; //50k amount
        int totalAmount = 500000 * a + 200000 * b + 100000 * c + 50000 * d;
        int borrowingMoney = 2000000;
        for (int i = 0; i <borrowingMoney/500000 ; i++) {

        }

        if (a==borrowingMoney/500000) {
//        a = (borrowingMoney - 200000*b - 100000*c - 50000*d)/500000;
            b = (borrowingMoney - 500000 * a - 100000 * c - 50000 * d) / 200000;
            c = (borrowingMoney - 500000 * a - 200000 * b - 50000 * d) / 100000;
            d = (borrowingMoney - 500000 * a - 200000 * b - 100000 * c) / 50000;
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }

// ví dụ cần rút 80k thì lấy 80/50 (Lấy ra số tờ 50k vì 50k có mệnh giá lớn nhất và nhỏ hơn số tiền cần rút)
    //80/50 =1 dư 30
    // lấy 30/20 = 1 dư 10 ( lấy ra só tờ 20k vì 20k có mệnh giá < 30
    // lấy 10/10 = 1 dư 0
    // dư 0 nghĩa là lấy ra đc 1 tờ 50 -20 -10


    private  static void hw2(){

        double firstBorrowingMoney = 600000000.0; //số tiền vay = 600tr

        double monthlyMoney = 10000000.0;  //  gốc phải trả hàng tháng 10tr

        double monthlyInterestRate = 0.06; //Lãi suất 1 năm

        double nextBorrowingMoney = firstBorrowingMoney;

        int year = 5;

        int month = 12;

        double needToPayMoney = 0.0; //Khởi tạo số tiền cần phải trả lần đầu tiên
        //Số tiền phải trả trong 5 năm
        for (int i = 0; i < (year*month) ; i++) {
            double monthlyInterestMoney = (nextBorrowingMoney * monthlyInterestRate)/12; //Số tiền lãi hàng tháng:  0.06*600/12
//            System.out.println(monthlyInterestMoney);
            needToPayMoney  = needToPayMoney + monthlyMoney + monthlyInterestMoney; //Số tiền gốc + lãi  phải trả hàng tháng
            nextBorrowingMoney -=  monthlyMoney;
        }
        System.out.println("Số tiền phải trả sau 5 năm: "+ (long)needToPayMoney);

    }

    private  static  void hw3(){
        //Nhập các phần tử trong mảng từ bàn phím
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            int number = scan.nextInt();
            numbers.add(number);

        }
        System.out.println("Các phần tử trong dãy là: " + numbers);
    }


        //Thêm phần tử vào mảng

}
