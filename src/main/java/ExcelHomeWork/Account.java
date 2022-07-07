package ExcelHomeWork;

import java.util.Scanner;

public class Account {
   private int id;
   private  String name;
   private  int balance;
   private  int credit;
   private int debit;
    Scanner scan = new Scanner(System.in);

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    // Khởi tạo getter và setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Khỏi tạo phương thức nạp tiền
    public int credit (){
        System.out.println("Input top up amount = ");

        int creditAmount = scan.nextInt();
        if (creditAmount>0){
            System.out.println("Top up " + creditAmount + " successfully");

        }else {
            System.out.println("Top up amount is invalid");
        }

        return creditAmount;
    }

    //Khởi tạo phương thức rút tiền
    public  void debit(){
        System.out.println("Input top up amount = ");
        int debitAmount = scan.nextInt();



    }

}
